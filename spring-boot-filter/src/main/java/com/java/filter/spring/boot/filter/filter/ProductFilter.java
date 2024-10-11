package com.java.filter.spring.boot.filter.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
@Slf4j
@Component
public class ProductFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        log.info("[MessageFilter] - Inside doFilterMethod");
        log.info("local port : "+ request.getLocalPort());
        log.info("server name : "+request.getServerName());

//        HttpServletRequest httpServletRequest= (HttpServletRequest) request;
        log.info("Methhod Name : "+request.getMethod());
        log.info("Request URI : "+request.getRequestURI());
        log.info("Servelet Path : "+request.getServletPath());
        filterChain.doFilter(request, response);
    }
}
