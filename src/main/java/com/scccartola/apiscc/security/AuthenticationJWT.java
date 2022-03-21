package com.scccartola.apiscc.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.scccartola.apiscc.data.UserDetailsData;
import com.scccartola.apiscc.models.entities.PlayerUser;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class AuthenticationJWT extends UsernamePasswordAuthenticationFilter{
    
    @Value("${expiration_token}")
    public static int EXPIRATION_TOKEN;

    @Value("${secret_key}")
    public static String SECRET_KEY;

    private final AuthenticationManager authenticationManager;

    public AuthenticationJWT(AuthenticationManager authenticationManager){
        this.authenticationManager = authenticationManager;
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {

        try {
            PlayerUser user = new ObjectMapper().readValue(request.getInputStream(), PlayerUser.class);

            return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                user.getEmail(),
                user.getPassword(),
                //user whitelist
                new ArrayList<>()
            ));
        } catch (IOException e) {
           throw new RuntimeException("Falha ao autenticar usuario", e);
        } 
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
    Authentication authResult) throws IOException, ServletException {

    UserDetailsData userData = (UserDetailsData) authResult.getPrincipal();

    String token = JWT.create().withSubject(userData.getUsername()).withExpiresAt(new Date(System.currentTimeMillis() + EXPIRATION_TOKEN))
    .sign(Algorithm.HMAC512(SECRET_KEY));


    response.getWriter().write(token);
    response.getWriter().flush();
    }

}
