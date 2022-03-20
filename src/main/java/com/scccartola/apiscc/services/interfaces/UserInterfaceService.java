package com.scccartola.apiscc.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.scccartola.apiscc.models.entities.PlayerUser;

public interface UserInterfaceService {
    public List<PlayerUser> findAllUsers();
    public PlayerUser findUserById(Long id);
    public PlayerUser createUser(PlayerUser user);
    public PlayerUser updateUser(Long id, PlayerUser user);
    public Optional <PlayerUser> findUserByEmail(String email);
    public void deleteUser(Long id);
}
