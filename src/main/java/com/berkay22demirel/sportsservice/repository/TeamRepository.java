package com.berkay22demirel.sportsservice.repository;

import com.berkay22demirel.sportsservice.model.Team;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeamRepository extends MongoRepository<Team, Integer> {

}
