package com.producter.basketballteam.config;

import com.producter.basketballteam.entity.Player;
import com.producter.basketballteam.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class Config implements CommandLineRunner {

    private final PlayerRepository repository;

    @Override
    public void run(String... args) throws Exception {

        Player abbas = new Player("abbas","ahmet","C");
        Player ahmet = new Player("ahmet","hirsi","AG");

        repository.save(abbas);
        repository.save(ahmet);

    }
}
