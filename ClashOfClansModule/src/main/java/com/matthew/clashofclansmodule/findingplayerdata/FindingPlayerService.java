package com.matthew.clashofclansmodule.findingplayerdata;

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

import java.io.IOException;

import static com.matthew.clashofclansmodule.ConstData.PLAYER_FINDING_URL;
import static com.matthew.clashofclansmodule.ConstData.TOKEN;

@Service
@RequiredArgsConstructor
@Slf4j
class FindingPlayerService {

    private final OkHttpClient httpClient;
    private final PlayerRepository playerRepository;
    private final RequestBuilder requestBuilder;
    ObjectMapper objectMapper = new ObjectMapper();

    public PlayerEntity findPlayer(String playerTag) throws IOException {

        Request request = requestBuilder.buildRequest(PLAYER_FINDING_URL + playerTag, TOKEN);

        try (Response response = httpClient.newCall(request).execute()) {

            assert response.body() != null;
            PlayerModel playerModel = objectMapper.readValue(response.body().string(), PlayerModel.class);

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
                playerModel.getClan().getName()
        );

        playerRepository.save(playerEntity);

        return playerEntity;
    }


}
