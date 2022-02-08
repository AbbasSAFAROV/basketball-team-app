package com.producter.basketballteam.resolves;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.producter.basketballteam.dto.PlayerDto;
import com.producter.basketballteam.entity.Player;
import com.producter.basketballteam.entity.Position;
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

    public Player createPlayer(PlayerDto player){
        Player player1 = new Player(player.getName(),player.getSurname(), player.getPosition());
        return playerService.createPlayer(player1);
    }

    public Player createPlayerWithPosition(String name,String surname,Position position){
        Player player1 = new Player(name,surname,position);
        return playerService.createPlayerWithPosition(player1);
    }

    public String deletePlayer(Long id){
        return playerService.deletePlayerById(id);
    }

    public Hello add(String message) {
        return service.add(message);
    }
}
