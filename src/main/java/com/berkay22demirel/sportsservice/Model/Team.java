package com.berkay22demirel.sportsservice.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Team extends BaseModel {
    private String name;

    public Team(Integer id, String name) {
        super.setId(id);
        this.name = name;
    }
}
