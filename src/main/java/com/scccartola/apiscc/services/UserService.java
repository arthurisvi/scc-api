package com.scccartola.apiscc.services;

import java.util.List;

import com.scccartola.apiscc.models.entities.PlayerUser;
import com.scccartola.apiscc.repositories.UserRepository;
import com.scccartola.apiscc.services.interfaces.UserInterfaceService;

import org.springframework.stereotype.Service;

@Service
public class UserService implements UserInterfaceService{

    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
   
    public List<PlayerUser> findAllUsers(){
        return userRepository.findAll();
    }
    
    public PlayerUser findUserById(Long id){
        return userRepository.findById(id).get();
    }
    
    public PlayerUser createUser(PlayerUser user){
        return userRepository.save(user);
    }
    
    public PlayerUser updateUser(Long id, PlayerUser user){
        PlayerUser recoveredUser = findUserById(id);

        if (user.getName() != null && user.getName() != recoveredUser.getName()) recoveredUser.setName(user.getName());
        if (user.getEmail() != null && user.getEmail() != recoveredUser.getEmail()) recoveredUser.setEmail(user.getEmail());
        if (user.getPassword() != null && user.getPassword() != recoveredUser.getPassword()) recoveredUser.setPassword(user.getPassword());
        if (user.getWhatsappNum() != null && user.getWhatsappNum() != recoveredUser.getWhatsappNum()) recoveredUser.setWhatsappNum(user.getWhatsappNum());

        return (PlayerUser) userRepository.save(recoveredUser);
    }
    
    public void deleteUser(Long id){
        PlayerUser user = (PlayerUser) findUserById(id);

        userRepository.delete(user);
    }
}

