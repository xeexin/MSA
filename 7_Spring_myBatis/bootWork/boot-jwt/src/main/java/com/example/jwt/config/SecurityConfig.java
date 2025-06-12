
package com.example.jwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.jwt.security.JwtFilter;

@Configuration
//@EnableJpaRepositories(basePackages = "com.example.jwt.repository") 
public class SecurityConfig {
	
    private final JwtFilter jwtFilter;  // ->[ 인증 + 토큰 검사 ]

    //DI
    public SecurityConfig(JwtFilter jwtFilter) {
        this.jwtFilter = jwtFilter;
    }

    // 인증에 관련
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()  // CSRF 보호모드 비활성화 *Restful API는 잘 사용하지 않음.
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/auth/**").permitAll()  // '/auth/**' 이 경로는 인증 없이 접근 허용
                .anyRequest().authenticated()  // 그 이외의 파일들을 인증이 필요.
            )
            // 세션을 사용하지 않고 : SessionCreationPolicy.STATELESS
            .sessionManagement(sm -> sm.sessionCreationPolicy(SessionCreationPolicy.STATELESS))  
            // JWT 필터를 사용하겠다. (JWT를 기반으로 상태유지를 하겠다)
            .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);  // Security 기본 로그인 필터보다 먼저 JWT 필터를 실행하겠다.
        return http.build();  // SecurityFilterChain 객체 생성
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
