package com.park.demo_park.Jwt;

import io.jsonwebtoken.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.security.sasl.AuthenticationException;

@Slf4j
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint {



    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, org.springframework.security.core.AuthenticationException authenticationException) throws java.io.IOException, ServletException {
            log.info("Http Status 401{}",authenticationException.getMessage());
            response.setHeader("www-authenticate","Bearer realm='/api/v1/auth'");
            response.sendError(401);
    }
}
