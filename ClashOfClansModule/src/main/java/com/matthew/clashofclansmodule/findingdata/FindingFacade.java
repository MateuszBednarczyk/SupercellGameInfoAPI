package com.matthew.clashofclansmodule.findingdata;

import com.matthew.clashofclansmodule.entities.ClanEntity;
import com.matthew.clashofclansmodule.entities.PlayerEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
class FindingFacade {

    private final PlayerService playerService;
    private final ClanService clanService;

    public PlayerEntity findPlayer(String playerTag) throws IOException {

        return playerService.findPlayer(playerTag);

    }

    public ClanEntity findClan(String playerTag) throws IOException {

        return clanService.findClan(playerTag);

    }

}
