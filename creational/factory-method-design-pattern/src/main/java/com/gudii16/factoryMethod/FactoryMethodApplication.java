package com.gudii16.factoryMethod;

import com.gudii16.factoryMethod.factory.EmailNotificationFactory;
import com.gudii16.factoryMethod.factory.NotificationFactory;
import com.gudii16.factoryMethod.factory.PushNotificationFactory;
import com.gudii16.factoryMethod.factory.SmsNotificationFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryMethodApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactoryMethodApplication.class, args);
		NotificationFactory notificationFactory;
		String type = "email";
		switch (type){
			case "email" : new EmailNotificationFactory().createNotification().notifyUser(); break;
			case "sms" : new SmsNotificationFactory().createNotification().notifyUser(); break;
			case "push" : new PushNotificationFactory().createNotification().notifyUser(); break;
			default:
				System.out.println("Invalid input");
		}
	}

}
