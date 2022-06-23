package com.matthew.clashofclansmodule;

import lombok.RequiredArgsConstructor;
import okhttp3.OkHttpClient;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class FindingPlayerService
{

    private final OkHttpClient httpClient;

}
