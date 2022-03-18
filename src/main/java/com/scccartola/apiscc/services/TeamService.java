package com.scccartola.apiscc.services;

import java.util.List;

import com.scccartola.apiscc.models.entities.Team;
import com.scccartola.apiscc.repositories.TeamRepository;
import com.scccartola.apiscc.services.interfaces.TeamInterfaceService;

import org.springframework.stereotype.Service;

@Service
public class TeamService implements TeamInterfaceService{
 
    private TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository){
        this.teamRepository = teamRepository;
    }

    public List<Team> findAllTeams(){
        return teamRepository.findAll();
    }

    public Team findTeamById(Long id){
        return teamRepository.findById(id).get();
    }

    public Team createTeam(Team team){
        return teamRepository.save(team);
    }

    public Team updateTeam(Long id, Team team){
        Team recoveredTeam = findTeamById(id);

        if (team.getName() != null && team.getName() != recoveredTeam.getName()) recoveredTeam.setName(team.getName());
        if (team.getPhoto() != null && team.getPhoto() != recoveredTeam.getPhoto()) recoveredTeam.setPhoto(team.getPhoto());
        if (team.getPlayerUser() != null && team.getPlayerUser() != recoveredTeam.getPlayerUser())recoveredTeam.setPlayerUser(team.getPlayerUser());

        return teamRepository.save(recoveredTeam);
    }

    public void deleteTeam(Long id){
        Team team = findTeamById(id);
        
        teamRepository.delete(team);
    }

}
