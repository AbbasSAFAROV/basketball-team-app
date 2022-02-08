package com.producter.basketballteam.service;


import com.producter.basketballteam.entity.Player;
import com.producter.basketballteam.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerService {

    private final PlayerRepository repository;

    public List<Player> getAllPlayers(){
        return repository.findAll();
    }

    public Player createPlayer(Player player){
        return repository.save(player);
    }

    public Player createPlayerWithPosition(Player player){
        return repository.save(player);
    }


    public String deletePlayerById(Long id){
        repository.delete(findPlayerById(id));
        return "player deleted id:"+id;
    }

    public Player findPlayerById(Long id){
        return repository.findById(id).orElseThrow(()->new RuntimeException("Player not found id"+id));
    }

}
