package com.berkay22demirel.sportsservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamDTO extends BaseModel {
    private String name;

    public TeamDTO(Integer id, String name) {
        super.setId(id);
        this.name = name;
    }
}
