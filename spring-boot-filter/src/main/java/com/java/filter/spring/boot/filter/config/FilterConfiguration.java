package com.java.filter.spring.boot.filter.config;

import com.java.filter.spring.boot.filter.filter.MessageFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Configuration;

// here we are registering the filter
@Configuration
public class FilterConfiguration {

    public FilterRegistrationBean<MessageFilter>registrationBean(){
        FilterRegistrationBean<MessageFilter> registrationBean=new FilterRegistrationBean<MessageFilter>();
        registrationBean.setFilter(new MessageFilter());
        registrationBean.addUrlPatterns("/customer/*");
        return registrationBean;
    }
}
