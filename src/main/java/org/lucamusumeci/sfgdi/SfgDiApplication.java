package org.lucamusumeci.sfgdi;

import org.lucamusumeci.sfgdi.controller.ConstructorInjectedController;
import org.lucamusumeci.sfgdi.controller.I18nController;
import org.lucamusumeci.sfgdi.controller.PropertyInjectedController;
import org.lucamusumeci.sfgdi.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
		System.out.println("By Property: " + propertyInjectedController.getGreeting());

		SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
		System.out.println("By Setter: " + setterInjectedController.getGreeting());

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
		System.out.println("By Contructor: " + constructorInjectedController.getGreeting());

		I18nController i18nController = (I18nController) context.getBean("InternationalizationController");
		System.out.println("I18n: " + i18nController.getGreeting());
	}
}
