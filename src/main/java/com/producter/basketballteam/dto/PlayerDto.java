package com.producter.basketballteam.dto;


import com.producter.basketballteam.entity.Position;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDto {

    private String name;
    private String surname;
    private Position position;

}
