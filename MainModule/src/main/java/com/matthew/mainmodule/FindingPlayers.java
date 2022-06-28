package com.matthew.mainmodule;

import lombok.RequiredArgsConstructor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
class FindingPlayers {

    private final OkHttpClient httpClient;
    private final RequestBuilder requestBuilder;

    public ResponseEntity<Object> sendRequestToMicroService(String gameTitle, String playerTag) throws IOException {

        if (gameTitle.equals("coc")) {

            Request request = requestBuilder.buildRequest(playerTag);
            try (Response response = httpClient.newCall(request).execute()) {

                return new ResponseEntity<>(HttpStatus.OK, HttpStatus.valueOf(response.body().string()));

            }

        }else if(gameTitle.equals("cr")){



        }else{



        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

}
