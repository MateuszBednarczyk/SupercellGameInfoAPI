package com.matthew.clashofclansmodule.FindingData;

import lombok.RequiredArgsConstructor;
import okhttp3.Response;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
class FindingFacade {

    private final FindingPlayerService findingPlayerService;

    public Response findPlayer(String playerTag) throws IOException {

        return findingPlayerService.findPlayer(playerTag);

    }

}
