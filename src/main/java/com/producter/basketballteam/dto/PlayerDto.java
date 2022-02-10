package com.producter.basketballteam.dto;


import com.producter.basketballteam.entity.Position;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlayerDto {

    private String name;
    private String surname;
    private Position position;

}
