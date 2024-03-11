package com.onlineshoppingapp.apigateway.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.server.ServerHttpRequest;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
//import org.springframework.security.config.web.server.ServerHttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.server.SecurityWebFilterChain;

//@Configuration
//@EnableWebFluxSecurity
public class SecurityConfig {

//    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity serverHttpSecurity){
//        serverHttpSecurity.csrf()
//                .disable()
//                .authorizeExchange(exchange -> exchange
//                        .pathMatchers("/eureka/**")
//                        .permitAll()
//                        .anyExchange()
//                        .authenticated())
//                .oauth2ResourceServer(ServerHttpSecurity.OAuth2ResourceServerSpec::jwt);
//
//
//        return serverHttpSecurity.build();
//
//
//    }
//public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//    http
//            .authorizeHttpRequests(authorize -> authorize
//                    .requestMatchers("/eureka/**").permitAll()
//                    .anyRequest().authenticated()
//            )
//            .rememberMe(Customizer.withDefaults());
//
//    return http.build();
//}
}
