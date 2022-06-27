package com.matthew.clashofclansmodule.findingclandata;

import com.matthew.clashofclansmodule.entities.ClanEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
class ClanController {

    private final ClanFacade clanFacade;

    @GetMapping("/findclan/{clanTag}")
    public ClanEntity findClan(@PathVariable String clanTag) throws IOException {

        return clanFacade.findClan(clanTag);

    }

}
