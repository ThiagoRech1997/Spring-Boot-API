package br.edu.utfpr.tac.agroapi1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AreaDTO {
    private String name;
    private Long poligonoX;
    private Long poligonoY;
}
