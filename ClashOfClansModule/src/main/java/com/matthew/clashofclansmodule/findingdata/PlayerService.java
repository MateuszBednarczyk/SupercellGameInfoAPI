package com.matthew.clashofclansmodule.findingdata;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.matthew.clashofclansmodule.RequestBuilder;
import com.matthew.clashofclansmodule.entities.PlayerEntity;
import com.matthew.clashofclansmodule.pojos.PlayerModel;
import com.matthew.clashofclansmodule.repositories.PlayerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.IOException;
import java.time.LocalDateTime;

import static com.matthew.clashofclansmodule.ConstData.PLAYER_FINDING_URL;

@Service
@RequiredArgsConstructor
@Slf4j
class PlayerService {

    private final RequestBuilder requestBuilder;
    private final PlayerRepository playerRepository;
    private final OkHttpClient httpClient;
    private final ObjectMapper objectMapper;
    LocalDateTime now = LocalDateTime.now();

    @Transactional
    public PlayerEntity findPlayer(String playerTag) throws IOException {

        PlayerEntity entityGotFromDatabase = playerRepository.findByTag("#" + playerTag);

        if (entityGotFromDatabase == null) {

            return createEntityToReturn(playerTag);

        } else if (!checkIfUserIsAvailableToSendRequest(entityGotFromDatabase)) {

            log.info(String.valueOf(checkIfUserIsAvailableToSendRequest(entityGotFromDatabase)));
            return entityGotFromDatabase;

        } else {

            playerRepository.deleteByTag("#" + playerTag);
            return createEntityToReturn(playerTag);

        }

    }

    @NotNull
    private PlayerEntity createEntityToReturn(String playerTag) throws IOException {

        Request request = requestBuilder.buildRequest(PLAYER_FINDING_URL + playerTag);

        log.info(String.valueOf(request.url()));

        try (Response response = httpClient.newCall(request).execute()) {

            assert response.body() != null;
            PlayerModel playerModel = objectMapper.readValue(response.body().string(), PlayerModel.class);

            if (!String.valueOf(response.code()).equals("200")) {

                throw new IOException("Something's wrong with response");

            }

            return createPlayerEntityAndSaveItInDatabase(playerModel);

        }

    }

    @NotNull
    private PlayerEntity createPlayerEntityAndSaveItInDatabase(PlayerModel playerModel) {

        PlayerEntity playerEntity = new PlayerEntity(
                playerModel.getTag(),
                playerModel.getName(),
                playerModel.getTownHallLevel(),
                playerModel.getExpLevel(),
                playerModel.getTrophies(),
                playerModel.getBestTrophies(),
                playerModel.getWarStars(),
                playerModel.getAttackWins(),
                playerModel.getDefenseWins(),
                playerModel.getBuilderHallLevel(),
                playerModel.getVersusTrophies(),
                playerModel.getBestVersusTrophies(),
                playerModel.getVersusBattleWins(),
                playerModel.getRole(),
                playerModel.getWarPreference(),
                playerModel.getDonations(),
                playerModel.getDonationsReceived(),
                now
        );

        if (playerModel.getClan() != null) {

            playerEntity.setClanName(playerModel.getClan().getName());

        }

        playerRepository.save(playerEntity);

        return playerEntity;

    }

    public boolean checkIfUserIsAvailableToSendRequest(PlayerEntity entityToCheck) {

        if (entityToCheck.getRequestDate().getMinute() - now.getMinute() >= 1) {

            log.info("available");

            return true;

        } else {

            return false;

        }

    }

}


