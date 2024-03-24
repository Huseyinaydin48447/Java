///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package springExample.rentACar.webApi.controllers;
//
///**
// *
// * @author Asus
// */
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.web.SecurityFilterChain;
//
//
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//            .authorizeRequests(authorize -> authorize
//                .anyRequest().authenticated()
//            )
//            .formLogin()
//            .and()
//            .httpBasic();
//        return http.build();
//    }
//}
