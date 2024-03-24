///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package springExample.rentACar.webApi.controllers;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
///**
// *
// * @author Asus
// */
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig  {
//
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//            .authorizeRequests()
//                .antMatchers("/login", "/register").permitAll() // Giriş ve kayıt için izin ver
//                .anyRequest().authenticated() // Diğer tüm istekler için giriş yapmış olma zorunluluğu
//            .and()
//            .formLogin()
//                .loginPage("/login") // Özel giriş sayfası
//                .permitAll()
//            .and()
//            .logout()
//                .permitAll();
//    }
//    
//    // ... diğer güvenlik konfigürasyonları ...
//}
//
