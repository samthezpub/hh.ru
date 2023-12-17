package com.example.hh.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityWebConfigurer {

    @Bean
    public SecurityFilterChain securityChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((request) ->
                request.requestMatchers("/").permitAll()
        );

        return http.build();
    }
}
