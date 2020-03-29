package com.furkankara.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.furkankara.A;

@Configuration
public class AConfig {

	@Bean(name="beanA")
	public A yaz() {
		return new A();
	}
	
	
}
