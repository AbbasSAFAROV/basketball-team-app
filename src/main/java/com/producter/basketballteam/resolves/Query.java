package com.producter.basketballteam.resolves;


import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.producter.basketballteam.entity.Player;
import com.producter.basketballteam.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import com.producter.basketballteam.entity.Hello;
import com.producter.basketballteam.service.HelloService;

import java.util.List;

@Component
@RequiredArgsConstructor
public class Query implements GraphQLQueryResolver {

    private final HelloService service;
    private final PlayerService playerService;


    public List<Player> getAllPlayers(){
        return playerService.getAllPlayers();
    }

    public Hello hello() {

        Hello h = new Hello();
        h.setMessage("hello");

        return h;
    }

    public List<Hello> allData() {
        return service.getAll();
    }
}
