package com.gudii16.abstractFactoryMethod;

import com.gudii16.abstractFactoryMethod.factory.GUIFactory;
import com.gudii16.abstractFactoryMethod.factory.MacGUIFactory;
import com.gudii16.abstractFactoryMethod.factory.WindowsGUIFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbstractFactoryMethodApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbstractFactoryMethodApplication.class, args);
		String product = "Mac";
		GUIFactory guiFactory;
		switch (product){
			case "Windows" : guiFactory = new WindowsGUIFactory(); break;
			case "Mac" : guiFactory = new MacGUIFactory(); break;
			default: guiFactory = null;
		}
		guiFactory.createButton().render();
		guiFactory.createCheckBox().paint();
	}

}
