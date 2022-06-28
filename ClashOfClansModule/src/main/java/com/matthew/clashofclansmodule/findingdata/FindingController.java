package com.matthew.clashofclansmodule.findingdata;

import com.matthew.clashofclansmodule.entities.ClanEntity;
import com.matthew.clashofclansmodule.entities.PlayerEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
class FindingController {

    private final FindingFacade findingFacade;

    @GetMapping("/findplayer/{playerTag}")
    public PlayerEntity findPlayer(@PathVariable String playerTag) throws IOException {

        return findingFacade.findPlayer(playerTag);

    }

    @GetMapping("/findclan/{clanTag}")
    public ClanEntity findClan(@PathVariable String clanTag) throws IOException {

        return findingFacade.findClan(clanTag);

    }

}
