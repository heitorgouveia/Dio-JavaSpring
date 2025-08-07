package spring.security.spring_security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.beans.factory.annotation.Autowired;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
    @Autowired
    private SecurityDataBaseService securityService;

    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
    DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
    authProvider.setUserDetailsService(securityService);
    authProvider.setPasswordEncoder(NoOpPasswordEncoder.getInstance()); // ou um encoder real como BCrypt
    return authProvider;}

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/").permitAll()
                .requestMatchers("/users").hasAnyRole("MANAGER", "USER")
                .requestMatchers("/managers").hasRole("MANAGER")
                .anyRequest().authenticated()
            )
            .httpBasic(withDefaults());

        return http.build();
    }
/*
    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("heitor")
                .password("123")
                .roles("USER")
                .build();
        UserDetails admin = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("master123")
                .roles("MANAGER")
                .build();
        return new InMemoryUserDetailsManager(user, admin);
    }*/
}
