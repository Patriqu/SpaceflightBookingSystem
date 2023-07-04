package com.siriusbase.spaceflightbooking.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration {
    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/", "/error", "/webjars/**").permitAll()
                        .anyRequest().authenticated()
                )
                .csrf(c -> c
                        .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
                );
                /*.exceptionHandling(e -> e
                        .authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED))
                )*/
                /*.oauth2Login()
                .failureHandler((request, response, exception) -> {
                    request.getSession().setAttribute("error.message", exception.getMessage());
                    //handler.onAuthenticationFailure(request, response, exception);
                    this.onAuthenticationFailure(request, response, exception);
                });*/
        return http.build();
    }

    @Bean
    UserDetailsService userDetailsService() {
        var userDetails = User.builder()
                .username("admin")
                .password("{noop}ab")
                .roles("admin")
                .build();

        return new InMemoryUserDetailsManager(userDetails);
    }
}
