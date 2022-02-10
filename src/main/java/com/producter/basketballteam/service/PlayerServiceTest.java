package com.producter.basketballteam.service;

import com.producter.basketballteam.dto.PlayerDto;
import com.producter.basketballteam.entity.Player;
import com.producter.basketballteam.entity.Position;
import com.producter.basketballteam.repository.PlayerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class PlayerServiceTest {

    @Mock
    private PlayerRepository repository;

    @InjectMocks
    private PlayerService service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        when(service.getAllPlayers()).thenReturn(preparePlayerData());
    }

    @Test
    void getAllPlayers() {
        assertEquals(service.getAllPlayers().size(),3);
    }

    @Test
    void createPlayer() {

        Player player = Player.builder().name("test-name").surname("test-surname").position(Position.C).build();
        Player playerMock = mock(Player.class);
        when(repository.save(ArgumentMatchers.any(Player.class))).thenReturn(playerMock);
        Player result = service.createPlayer(player);

        when(playerMock.getId()).thenReturn(1L);
        assertEquals(result.getId(),1L);

        when(playerMock.getName()).thenReturn("test-name");
        assertEquals(result.getName(),player.getName());

    }

    @Test
    void deletePlayerById() {

    }

    public List<Player> preparePlayerData(){
        return Arrays.asList(
                Player.builder().name("test-name").surname("test-surname").position(Position.C).build(),
                Player.builder().name("test-name1").surname("test-surname1").position(Position.C).build(),
                Player.builder().name("test-name2").surname("test-surname2").position(Position.C).build());
    }

}