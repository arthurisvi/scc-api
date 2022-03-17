package com.scccartola.apiscc.services.interfaces;

import java.util.List;

import com.scccartola.apiscc.models.entities.Team;

public interface TeamInterfaceService {

    public List<Team> findAllTeams();
    public Team findTeamById(Long id);
    public Team createTeam(Team team);
    public Team updateTeam(Long id, Team Team);
    public void deleteTeam(Long id);
}
