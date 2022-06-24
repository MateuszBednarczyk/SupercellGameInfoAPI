package com.matthew.clashofclansmodule.findingplayerdata;

import com.matthew.clashofclansmodule.entities.PlayerEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
class FindingFacade {

    private final FindingPlayerService findingPlayerService;

    public PlayerEntity findPlayer(String playerTag) throws IOException {

        return findingPlayerService.findPlayer(playerTag);

    }

}