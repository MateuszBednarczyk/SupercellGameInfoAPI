package com.matthew.clashofclansmodule.FindingData;

import lombok.RequiredArgsConstructor;
import okhttp3.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
public class FindingController {

    private final FindingFacade findingFacade;

    @GetMapping("/findplayer/{playerTag}")
    public Response findPlayer(@PathVariable String playerTag) throws IOException {

        return findingFacade.findPlayer(playerTag);

    }

}
