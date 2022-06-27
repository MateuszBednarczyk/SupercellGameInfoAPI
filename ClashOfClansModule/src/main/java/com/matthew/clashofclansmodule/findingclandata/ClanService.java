package com.matthew.clashofclansmodule.findingclandata;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.matthew.clashofclansmodule.RequestBuilder;
import com.matthew.clashofclansmodule.entities.ClanEntity;
import com.matthew.clashofclansmodule.pojos.Clan;
import com.matthew.clashofclansmodule.repositories.ClanRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDateTime;

import static com.matthew.clashofclansmodule.ConstData.CLAN_FINDING_URL;

@Service
@Slf4j
@RequiredArgsConstructor
class ClanService {

    private final RequestBuilder requestBuilder;
    private final ClanRepository clanRepository;
    private final OkHttpClient httpClient;
    private final ObjectMapper objectMapper;
    LocalDateTime now = LocalDateTime.now();

    public ClanEntity findClan(String clanTag) throws IOException {

        ClanEntity entityGotFromDatabase = clanRepository.findByTag(clanTag);

        if (entityGotFromDatabase == null) {

            return createEntityToReturn(clanTag);

        } else if (checkIfUserIsAvailableToSendRequest(entityGotFromDatabase)) {

            clanRepository.deleteByTag(clanTag);

            return createEntityToReturn(clanTag);

        } else {

            return entityGotFromDatabase;

        }

    }

    @NotNull
    private ClanEntity createEntityToReturn(String clanTag) throws IOException {

        Request request = requestBuilder.buildRequest(CLAN_FINDING_URL + clanTag);

        log.info(String.valueOf(request.url()));

        try (Response response = httpClient.newCall(request).execute()) {

            assert response.body() != null;
            Clan clanModel = objectMapper.readValue(response.body().string(), Clan.class);

            if(!String.valueOf(response.code()).equals("200")){

                throw new IOException("Something's wrong with response");

            }

            ClanEntity clanEntity = new ClanEntity(clanModel.getTag(), clanModel.getName(), clanModel.getClanLevel(), now);
            clanRepository.save(clanEntity);

            return clanEntity;

        }

    }


    public boolean checkIfUserIsAvailableToSendRequest(ClanEntity entityToCheck) {

        if (entityToCheck.getRequestDate().getSecond() - System.currentTimeMillis() == 30) {

            log.info("available");

            return true;

        } else {

            return false;

        }

    }

}
