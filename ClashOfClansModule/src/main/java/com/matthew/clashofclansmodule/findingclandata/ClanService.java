package com.matthew.clashofclansmodule.findingclandata;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.matthew.clashofclansmodule.RequestBuilder;
import com.matthew.clashofclansmodule.entities.ClanEntity;
import com.matthew.clashofclansmodule.pojos.Clan;
import com.matthew.clashofclansmodule.repositories.ClanRepository;
import lombok.RequiredArgsConstructor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;

import java.io.IOException;

import static com.matthew.clashofclansmodule.ConstData.CLAN_FINDING_URL;

@Service
@RequiredArgsConstructor
class ClanService {

    private final RequestBuilder requestBuilder;
    private final ClanRepository clanRepository;
    private final OkHttpClient httpClient;
    private final ObjectMapper objectMapper;

    public ClanEntity findClan(String clanTag) throws IOException {

        Request request = requestBuilder.buildRequest(CLAN_FINDING_URL + clanTag);

        try (Response response = httpClient.newCall(request).execute()) {

            assert response.body() != null;
            Clan clanModel = objectMapper.readValue(response.body().string(), Clan.class);

            return createClanEntityAndSaveItInDatabase(clanModel);

        }

    }

    public ClanEntity createClanEntityAndSaveItInDatabase(Clan clanModel) {

        ClanEntity clanEntity = new ClanEntity(clanModel.getTag(), clanModel.getName(), clanModel.getClanLevel());
        clanRepository.save(clanEntity);

        return clanEntity;

    }

}
