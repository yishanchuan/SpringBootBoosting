package com.di.exam.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    //security配置类，路由策略和访问权限的简单配置
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()    //启用默认登录页面
                .failureForwardUrl("/404")
                .defaultSuccessUrl("/index")
                .permitAll();  //登录页面全部用户可访问
        super.configure(http);
    }

    // 配置内存用户
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder.inMemoryAuthentication()
                                    .withUser("docin").password("docin123").roles("ADMIN")
                .and()
                .withUser("test").password("tester").roles("USER");
    }
}
