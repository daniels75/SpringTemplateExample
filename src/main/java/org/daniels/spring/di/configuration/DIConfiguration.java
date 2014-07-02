package org.daniels.spring.di.configuration;

import org.daniels.spring.di.services.EmailService;
import org.daniels.spring.di.services.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value={"org.daniels.spring.di..consumer"})
public class DIConfiguration {

	@Bean
	public MessageService getMessageService(){
		return new EmailService();
	}
}
