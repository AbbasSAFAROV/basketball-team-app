package com.producter.basketballteam.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private Position position;

    public Player(String name, String surname, Position position) {
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    public Player(String name) {
        this.name = name;
    }
}
