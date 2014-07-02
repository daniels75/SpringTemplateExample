package org.daniels.spring.di.main;

import org.daniels.spring.di.configuration.DIConfiguration;
import org.daniels.spring.di.consumer.MyApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
		MyApplication app = context.getBean(MyApplication.class);
		
		app.processMessage("Hi Daniel", "del@o2.com");
		
		//close the context
		context.close();
	}

}
