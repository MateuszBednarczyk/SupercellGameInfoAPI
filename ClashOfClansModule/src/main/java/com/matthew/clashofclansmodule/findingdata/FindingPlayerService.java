package com.matthew.clashofclansmodule.findingdata;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.matthew.clashofclansmodule.models.entities.PlayerEntity;
import com.matthew.clashofclansmodule.models.pojos.PlayerModel;
import com.matthew.clashofclansmodule.models.repositories.PlayerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
@Slf4j
class FindingPlayerService {

    private final OkHttpClient httpClient;
    private final PlayerRepository playerRepository;
    String token = "Bearer " + "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiIsImtpZCI6IjI4YTMxOGY3LTAwMDAtYTFlYi03ZmExLTJjNzQzM2M2Y2NhNSJ9.eyJpc3MiOiJzdXBlcmNlbGwiLCJhdWQiOiJzdXBlcmNlbGw6Z2FtZWFwaSIsImp0aSI6Ijc3OWU1MGUwLTAzZjctNGEwOS1hMTg1LWNhOTkzZTgzZGQ2MSIsImlhdCI6MTY1NTk3OTkwMywic3ViIjoiZGV2ZWxvcGVyLzVlOTkyMzAzLWVmZGYtYTIxMy0wNzU2LTc2OWUyNTg3ZjQwMSIsInNjb3BlcyI6WyJjbGFzaCJdLCJsaW1pdHMiOlt7InRpZXIiOiJkZXZlbG9wZXIvc2lsdmVyIiwidHlwZSI6InRocm90dGxpbmcifSx7ImNpZHJzIjpbIjE0Ni43MC44NS4yNiJdLCJ0eXBlIjoiY2xpZW50In1dfQ.TJScbBcx84L4YjKqg7QsSSu54tDij1KikBuUVb3TbEO0BlhWw81fdUPk0-4QXPwK85Nzw3bJmBnKWJQ88q0IqQ";
    String url = "https://api.clashofclans.com/v1/players/%23";
    ObjectMapper objectMapper = new ObjectMapper();

    public PlayerEntity findPlayer(String playerTag) throws IOException {

        Request request = buildRequest(playerTag);

        try (Response response = httpClient.newCall(request).execute()) {

            assert response.body() != null;
            PlayerModel playerModel = objectMapper.readValue(response.body().string(), PlayerModel.class);
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

    @NotNull
    private Request buildRequest(String playerTag) {
        return new Request.Builder()
                .url(url + playerTag)
                .header("Authorization", token)
                .build();
    }

}