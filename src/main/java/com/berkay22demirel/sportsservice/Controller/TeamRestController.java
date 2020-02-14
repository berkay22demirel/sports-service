package com.berkay22demirel.sportsservice.Controller;

import com.berkay22demirel.sportsservice.Model.Team;
import org.springframework.web.bind.annotation.*;

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

    //http://localhost:8080/team/all
    @RequestMapping(value = "/team/all")
    public Collection<Team> getAll() {
        return teamsMap.values();
    }

    //http://localhost:8080/team/3
    @RequestMapping(value = "/team/{id}")
    public Team getTeamById(@PathVariable("id") Integer id) {
        return teamsMap.get(id);
    }

    //http://localhost:8080/team?id=3
    @GetMapping(value = "/team")
    public Team getTeamIdByName(@RequestParam(value = "id", defaultValue = "") Integer id) {
        return teamsMap.get(id);
    }
}
