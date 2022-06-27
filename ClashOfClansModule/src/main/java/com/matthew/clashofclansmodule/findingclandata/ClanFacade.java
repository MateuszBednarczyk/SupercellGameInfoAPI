package com.matthew.clashofclansmodule.findingclandata;

import com.matthew.clashofclansmodule.entities.ClanEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
class ClanFacade {

    private final ClanService clanService;

    public ClanEntity findClan(String clanTag) throws IOException {

        return clanService.findClan(clanTag);

    }

}
