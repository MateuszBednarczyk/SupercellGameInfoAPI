package com.matthew.clashofclansmodule;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class TestController {

    OkHttpClient okHttpClient = new OkHttpClient();

    String token = "Bearer " +
            "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiIsImtpZCI6IjI4YTMxOGY3LTAwMDAtYTFlYi03ZmExLTJjNzQzM2M2Y2NhNSJ9.eyJpc3MiOiJzdXBlcmNlbGwiLCJhdWQiOiJzdXBlcmNlbGw6Z2FtZWFwaSIsImp0aSI6IjQ5OGJjMDVhLWU0YWYtNDQ0MS1hODIwLTQ1YzFjZDYyMWE4OSIsImlhdCI6MTY1NTk3MTY2Niwic3ViIjoiZGV2ZWxvcGVyLzVlOTkyMzAzLWVmZGYtYTIxMy0wNzU2LTc2OWUyNTg3ZjQwMSIsInNjb3BlcyI6WyJjbGFzaCJdLCJsaW1pdHMiOlt7InRpZXIiOiJkZXZlbG9wZXIvc2lsdmVyIiwidHlwZSI6InRocm90dGxpbmcifSx7ImNpZHJzIjpbIjE0Ni43MC44NS4yMSJdLCJ0eXBlIjoiY2xpZW50In1dfQ.6IrDOpNI6HiSuGKUqirix6b2lu_Mvziei4o48gCUrq_BgbwlwdzI9Z0MDFra7v5JSQR4xMDQPzJ0gTwuJNvVJQ";
    String url = "https://api.clashofclans.com/v1/players/";

    @GetMapping("/test/{tag}")
    public String testController(@PathVariable String tag) throws IOException {

        Request request = new Request.Builder()
                .url(url + tag)
                .header("Authorization", token)
                .build();

        try (Response response = okHttpClient.newCall(request).execute()){

            return response.body().string();

        }

    }

}
