package com.producter.basketballteam.resolvers;


import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.producter.basketballteam.entity.Player;
import com.producter.basketballteam.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class Query implements GraphQLQueryResolver {

    private final PlayerService playerService;

    public List<Player> getAllPlayers(){
        return playerService.getAllPlayers();
    }

}
