package com.scccartola.apiscc.services;

import java.util.Optional;

import com.scccartola.apiscc.data.UserDetailsData;
import com.scccartola.apiscc.models.entities.PlayerUser;
import com.scccartola.apiscc.repositories.UserRepository;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class UserDetailsServiceImpl implements UserDetailsService{

    private final UserRepository userRepository;

    public UserDetailsServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<PlayerUser> user = userRepository.findUserByEmail(username);

        if(user.isEmpty()){
            throw new UsernameNotFoundException("Usuário de email [" + username + "] não encontrado");
        }

        return new UserDetailsData(user);
    }
    
}