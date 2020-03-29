package com.furkankara;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.furkankara.config.SpringBeanConfig;

public class Merkez {


	@SuppressWarnings("resource")
	public static void main(String[] args) {
			
		
		 //ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");

		 AnnotationConfigApplicationContext appCtx = new AnnotationConfigApplicationContext();
		 appCtx.register(SpringBeanConfig.class);
		 
		 appCtx.refresh();
		 
		 A aNesnesi = (A) appCtx.getBean("beanA");
		 aNesnesi.yaz("Guzel goren, guzel dusunur");
		 
		 B bNesnesi = appCtx.getBean("beanB",B.class);
		 bNesnesi.yaz("Guzel dusunen, hayatindan lezzet alir. \n B.S.N");
		 
		 
		 ((ConfigurableApplicationContext)appCtx).close();
	
	
	
	
	}
}
