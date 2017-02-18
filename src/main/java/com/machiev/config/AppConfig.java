package com.machiev.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.machiev.service", "com.machiev.controller"})
public class AppConfig {
	@Bean
    public ViewResolver jspViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/WEB-INF/view/");
        resolver.setSuffix(".jsp");
        resolver.setOrder(2);
        return resolver;
    }

//    @Bean
//    public UrlBasedViewResolver urlBasedViewResolver(){
//        UrlBasedViewResolver resolver = new UrlBasedViewResolver();
//        resolver.setPrefix("/WEB-INF/view/");
//        resolver.setSuffix(".jsp");
//        resolver.setViewClass(JstlView.class);
//        resolver.setOrder(1);
//        return resolver;
//    }
}