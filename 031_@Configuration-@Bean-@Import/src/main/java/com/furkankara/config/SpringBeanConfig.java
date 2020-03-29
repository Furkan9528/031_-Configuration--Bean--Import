package com.furkankara.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.furkankara.*")
@Import({AConfig.class, BConfig.class})
public class SpringBeanConfig {
}
