package com.berkay22demirel.sportsservice.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString

@Document(collection = "team")
public class Team {

    @Id
    private int id;
    private String name;
}
