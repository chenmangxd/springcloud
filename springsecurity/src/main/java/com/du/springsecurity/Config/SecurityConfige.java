//package com.du.springsecurity.Config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//public class SecurityConfige extends WebSecurityConfigurerAdapter {
////    @Override
////    protected void configure(HttpSecurity http) throws Exception {
////        http.formLogin() // 表单登录
////                .and()
////                .authorizeRequests() // 认证配置
////                .anyRequest() // 任何请求
////                .authenticated(); // 都需要身份验证
////    }
//
////    @Override
////    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
////        String psw = encoder.encode("123456");
////        auth.inMemoryAuthentication().withUser("root").password(psw).roles("admin");
////
////    }
//
////    @Bean
////    PasswordEncoder password(){
////        return new BCryptPasswordEncoder();
////    }
//}