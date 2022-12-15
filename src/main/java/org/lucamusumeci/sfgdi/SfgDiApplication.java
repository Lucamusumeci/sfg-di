package org.lucamusumeci.sfgdi;

import org.lucamusumeci.sfgdi.controller.*;
import org.lucamusumeci.sfgdi.datasource.FakeDataSource;
import org.lucamusumeci.sfgdi.datasource.FakeDataSourceWithConstructorBinding;
import org.lucamusumeci.sfgdi.datasource.FakeDataSourceWithPropertyBinding;
import org.lucamusumeci.sfgdi.service.PrototypeBean;
import org.lucamusumeci.sfgdi.service.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
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
		System.out.println("By Constructor: " + constructorInjectedController.getGreeting());

		I18nController i18nController = (I18nController) context.getBean("InternationalizationController");
		System.out.println("I18n: " + i18nController.getGreeting());

		ConfigController configController = (ConfigController) context.getBean("configController");
		System.out.println("Config: " + configController.sayHello());

		XMLController xmlController = (XMLController) context.getBean("xmlController");
		System.out.println("XML: " + xmlController.sayHello());

		PrototypeBean prototypeBean1 = (PrototypeBean) context.getBean("prototypeBean");
		prototypeBean1.method();

		PrototypeBean prototypeBean2 = (PrototypeBean) context.getBean("prototypeBean");
		prototypeBean2.method();

		SingletonBean singletonBean1 = (SingletonBean) context.getBean("singletonBean");
		singletonBean1.method();

		SingletonBean singletonBean2 = (SingletonBean) context.getBean("singletonBean");
		singletonBean2.method();

		FakeDataSource fakeDataSource = (FakeDataSource) context.getBean("fakeDataSource");
		System.out.println(fakeDataSource.toString());

		FakeDataSourceWithPropertyBinding fakeDataSourceWithPropertyBinding = (FakeDataSourceWithPropertyBinding) context.getBean("fakeDataSourceWithPropertyBinding");
		System.out.println(fakeDataSourceWithPropertyBinding.toString());

		FakeDataSourceWithConstructorBinding fakeDataSourceWithConstructorBinding = context.getBean(FakeDataSourceWithConstructorBinding.class);	//You can use class as well
		System.out.println(fakeDataSourceWithConstructorBinding.toString());


	}
}
