package com.matthew.clashofclansmodule.FindingData;

import lombok.RequiredArgsConstructor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
class FindingPlayerService {

    private final OkHttpClient httpClient;
    String token = "Bearer " + "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiIsImtpZCI6IjI4YTMxOGY3LTAwMDAtYTFlYi03ZmExLTJjNzQzM2M2Y2NhNSJ9.eyJpc3MiOiJzdXBlcmNlbGwiLCJhdWQiOiJzdXBlcmNlbGw6Z2FtZWFwaSIsImp0aSI6Ijc3OWU1MGUwLTAzZjctNGEwOS1hMTg1LWNhOTkzZTgzZGQ2MSIsImlhdCI6MTY1NTk3OTkwMywic3ViIjoiZGV2ZWxvcGVyLzVlOTkyMzAzLWVmZGYtYTIxMy0wNzU2LTc2OWUyNTg3ZjQwMSIsInNjb3BlcyI6WyJjbGFzaCJdLCJsaW1pdHMiOlt7InRpZXIiOiJkZXZlbG9wZXIvc2lsdmVyIiwidHlwZSI6InRocm90dGxpbmcifSx7ImNpZHJzIjpbIjE0Ni43MC44NS4yNiJdLCJ0eXBlIjoiY2xpZW50In1dfQ.TJScbBcx84L4YjKqg7QsSSu54tDij1KikBuUVb3TbEO0BlhWw81fdUPk0-4QXPwK85Nzw3bJmBnKWJQ88q0IqQ";
    String url = "https://api.clashofclans.com/v1/players/%23";

    public Response findPlayer(String playerTag) throws IOException {

        Request request = buildRequest(playerTag);

        try (Response response = httpClient.newCall(request).execute()) {

            return response;

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
