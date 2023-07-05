package com.siriusbase.spaceflightbooking.config;

import org.springframework.context.annotation.Configuration;

//@EnableWebSecurity
@Configuration
public class SecurityConfiguration {
    /*@Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/", "/error", "/webjars/**").permitAll()
                        .anyRequest().authenticated()
                )
                .authorizeHttpRequests(authorize -> authorize.anyRequest().permitAll())
                .csrf(c -> c
                        .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
                )
                .exceptionHandling(e -> e
                        .authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED))
                )
                .oauth2Login()
                .failureHandler((request, response, exception) -> {
                    request.getSession().setAttribute("error.message", exception.getMessage());
                    //handler.onAuthenticationFailure(request, response, exception);
                    this.onAuthenticationFailure(request, response, exception);
                });
        return http.build();
    }*/

    /*@Bean
    UserDetailsService userDetailsService() {
        var userDetails = User.builder()
                .username("admin")
                .password("{noop}ab")
                .roles("admin")
                .build();

        return new InMemoryUserDetailsManager(userDetails);
    }*/
}
