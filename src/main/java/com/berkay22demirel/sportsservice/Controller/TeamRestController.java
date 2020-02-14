package com.berkay22demirel.sportsservice.Controller;

import com.berkay22demirel.sportsservice.Model.Team;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TeamRestController {

    private Map<Integer, Team> teamsMap = new HashMap<>();

    @PostConstruct
    public void init() {
        teamsMap.put(1, new Team(1, "Beşiktaş"));
        teamsMap.put(2, new Team(2, "Fenerbahçe"));
        teamsMap.put(3, new Team(3, "Galatasaray"));
        teamsMap.put(4, new Team(4, "Trabzon"));
    }

    @RequestMapping(value = "/team/all")
    public Collection<Team> getAll() {
        return teamsMap.values();
    }

    @RequestMapping(value = "/team/{id}")
    public Team getMatch(@PathVariable("id") Integer id) {
        return teamsMap.get(id);
    }
}
