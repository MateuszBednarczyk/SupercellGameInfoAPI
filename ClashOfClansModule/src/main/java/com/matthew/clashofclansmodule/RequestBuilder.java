package com.matthew.clashofclansmodule;

import lombok.RequiredArgsConstructor;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RequestBuilder {

    @NotNull
    public Request buildRequest(String url, String token) {
        return new Request.Builder()
                .url(url)
                .header("Authorization", token)
                .build();
    }
}
