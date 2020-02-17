package com.berkay22demirel.sportsservice.controller;

import com.berkay22demirel.sportsservice.model.Team;
import com.berkay22demirel.sportsservice.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TeamRestController {

    @Autowired
    private TeamRepository repository;

    //http://localhost:8080/team/add
    @PostMapping("/team/add")
    public String saveTeam(@RequestBody Team team) {
        repository.save(team);
        return "Added team with id : " + team.getId();
    }

    //http://localhost:8080/team/all
    @RequestMapping(value = "/team/all")
    public List<Team> getAll() {
        return repository.findAll();
    }

    //http://localhost:8080/team/3
    @RequestMapping(value = "/team/{id}")
    public Optional<Team> getTeamById(@PathVariable("id") int id) {
        return repository.findById(id);
    }

    //http://localhost:8080/team?id=3
    @GetMapping(value = "/team")
    public Optional<Team> getTeamByIdWithOther(@RequestParam(value = "id", defaultValue = "") int id) {
        return repository.findById(id);
    }

    @DeleteMapping(value = "/team/delete/{id}")
    public String deleteTeam(@PathVariable int id) {
        repository.deleteById(id);
        return "Team deleted with id : " + id;
    }
}
