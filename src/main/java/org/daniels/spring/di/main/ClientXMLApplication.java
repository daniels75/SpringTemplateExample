package org.daniels.spring.di.main;

import org.daniels.spring.di.consumer.MyXMLApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientXMLApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		MyXMLApplication app = context.getBean(MyXMLApplication.class);

		app.processMessage("Hi Daniels", "testme@org");

		// close the context
		context.close();
	}

}
