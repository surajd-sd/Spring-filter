package com.java.filter.spring.boot.filter.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;
@Slf4j
@Component
public class MessageFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        log.info("[MessageFilter] - Inside doFilterMethod");
        log.info("local port : "+ servletRequest.getLocalPort());
        log.info("server name : "+servletRequest.getServerName());

        HttpServletRequest httpServletRequest= (HttpServletRequest) servletRequest;
        log.info("Methhod Name : "+httpServletRequest.getMethod());
        log.info("Request URI : "+httpServletRequest.getRequestURI());
        log.info("Servelet Path : "+httpServletRequest.getServletPath());
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
