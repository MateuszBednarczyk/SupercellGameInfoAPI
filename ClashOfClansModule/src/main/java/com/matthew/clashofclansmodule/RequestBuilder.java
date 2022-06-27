package com.matthew.clashofclansmodule;

import lombok.RequiredArgsConstructor;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import static com.matthew.clashofclansmodule.ConstData.TOKEN;

@Service
@RequiredArgsConstructor
public class RequestBuilder {

    @NotNull
    public Request buildRequest(String url) {
        return new Request.Builder()
                .url(url)
                .header("Authorization", TOKEN)
                .build();
    }
}
