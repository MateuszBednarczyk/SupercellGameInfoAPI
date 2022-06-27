package com.matthew.clashofclansmodule.findingplayerdata;

import com.matthew.clashofclansmodule.entities.PlayerEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
class PlayerController {

    private final PlayerFacade playerFacade;

    @GetMapping("/findplayer/{playerTag}")
    public PlayerEntity findPlayer(@PathVariable String playerTag) throws IOException {

        return playerFacade.findPlayer(playerTag);

    }

}
