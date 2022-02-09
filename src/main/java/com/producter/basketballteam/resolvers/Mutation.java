package com.producter.basketballteam.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.producter.basketballteam.dto.PlayerDto;
import com.producter.basketballteam.entity.Player;
import com.producter.basketballteam.entity.Position;
import com.producter.basketballteam.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Mutation implements GraphQLMutationResolver {


    private final PlayerService playerService;

    public Player createPlayer(PlayerDto player){
        Player player1 = new Player(player.getName(),player.getSurname(), player.getPosition());
        return playerService.createPlayer(player1);
    }

    public String deletePlayer(Long id){
        return playerService.deletePlayerById(id);
    }


}
