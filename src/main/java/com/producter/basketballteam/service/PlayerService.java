package com.producter.basketballteam.service;


import com.producter.basketballteam.entity.Player;
import com.producter.basketballteam.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PlayerService {

    private final PlayerRepository repository;

    public List<Player> getAllPlayers(){
        return repository.findAll();
    }

    public Player createPlayer(Player player){
        if ( getAllPlayers().size() <= 12) {
            log.info(String.valueOf(getAllPlayers().size()));
            return repository.save(player);
        }
        throw new RuntimeException("the teams capacity is full!!");
    }


    public String deletePlayerById(Long id){
        repository.delete(findPlayerById(id));
        return "player deleted id:"+id;
    }

    public Player findPlayerById(Long id){
        return repository.findById(id).orElseThrow(()->new RuntimeException("Player not found id"+id));
    }

}
