package com.matthew.mainmodule;

import lombok.RequiredArgsConstructor;
import okhttp3.Request;
import org.springframework.stereotype.Service;

@Service
public class RequestBuilder {

    public Request buildRequest(String url) {
        return new Request.Builder()
                .url(url)
                .build();
    }

}
