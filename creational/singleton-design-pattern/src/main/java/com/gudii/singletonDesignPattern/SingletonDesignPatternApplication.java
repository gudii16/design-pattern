package com.gudii.singletonDesignPattern;

import com.gudii.singletonDesignPattern.config.ConfigurationManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

@SpringBootApplication
public class SingletonDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingletonDesignPatternApplication.class, args);
		System.out.println("DB URL:"+ConfigurationManager.getInstance().getProperty("db.url"));
		System.out.println("Password:"+ConfigurationManager.getInstance().getProperty("db.password"));
	}

}
