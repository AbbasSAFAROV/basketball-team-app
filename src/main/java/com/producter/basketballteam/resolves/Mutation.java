package com.producter.basketballteam.resolves;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.producter.basketballteam.dto.PlayerDto;
import com.producter.basketballteam.entity.Player;
import com.producter.basketballteam.repository.PlayerRepository;
import com.producter.basketballteam.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import com.producter.basketballteam.entity.Hello;
import com.producter.basketballteam.service.HelloService;

@Component
@RequiredArgsConstructor
public class Mutation implements GraphQLMutationResolver {


    private final PlayerService playerService;
    private final HelloService service;


    public Player createPlayer(Player player){
        return playerService.createPlayer(player);
    }
    public Player createPlayerDto(PlayerDto player){
        Player player1 = new Player(player.getName(),player.getSurname(),player.getPosition());
        return playerService.createPlayer(player1);
    }


    public Player createAPlayer(String name,String surname,String position){
        return playerService.createAPlayer(name,surname,position);
    }

    public Player create(String name){
        return playerService.create(name);
    }


    public Hello add(String message) {
        return service.add(message);
    }
}
