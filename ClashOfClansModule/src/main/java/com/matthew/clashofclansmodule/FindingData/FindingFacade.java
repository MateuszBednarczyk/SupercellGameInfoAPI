package com.matthew.clashofclansmodule.FindingData;

import com.matthew.clashofclansmodule.Models.PlayerModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
class FindingFacade {

    private final FindingPlayerService findingPlayerService;

    public PlayerModel findPlayer(String playerTag) throws IOException {

        return findingPlayerService.findPlayer(playerTag);

    }

}
