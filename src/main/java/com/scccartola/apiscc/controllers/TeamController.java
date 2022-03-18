package com.scccartola.apiscc.controllers;

import java.util.List;

import com.scccartola.apiscc.models.entities.Team;
import com.scccartola.apiscc.services.TeamService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value = "/teams")
public class TeamController {
    
    private TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping
    public ResponseEntity<List<Team>> findAllTeams(){
        return ResponseEntity.ok(teamService.findAllTeams());
    }

    @GetMapping (value = "/{id}")
    public ResponseEntity<Team> findTeamById(@PathVariable Long id){
        return ResponseEntity.ok(teamService.findTeamById(id));
    }

    @PostMapping
    public ResponseEntity<Team> createTeam(@RequestBody Team newTeam){
        return ResponseEntity.ok(teamService.createTeam(newTeam));
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<Team> updateTeam(@PathVariable Long id, @RequestBody Team updateTeam){
        return ResponseEntity.ok(teamService.updateTeam(id, updateTeam));
    }

    @DeleteMapping (value = "/{id}")
    public ResponseEntity<Void> deleteTeam(@PathVariable Long id){
        teamService.deleteTeam(id);
        return ResponseEntity.noContent().build();
    }
}
