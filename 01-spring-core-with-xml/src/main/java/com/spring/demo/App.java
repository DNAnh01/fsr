package com.spring.demo;

import com.spring.bean.Item;
import com.spring.service.ClientService;
import com.spring.service.ItemService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.stream.Stream;

import static com.spring.service.ClientService.*;
import static com.spring.utils.IocUtils.printIocBeanNames;

public class App {
	private static final String SPRING_BEANS_XML_PATH = "spring-beans.xml";

	public static void main(String[] args) {
		// B1: Item class - Plain Object
		// B2: Configuration Metadata - Defined bean and dependencies
		// B3: Construct Spring IOC Container from configuration file

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(SPRING_BEANS_XML_PATH);

		System.out.println("/////////////// --- Bean Definition Names --- ////////////////");
		printIocBeanNames(context);


		System.out.println("/////////////// --- IOC DI --- ////////////////");
		Item itemA = context.getBean("itemA", Item.class);
		Item itemB = context.getBean("itemB", Item.class);
		Item itemC = context.getBean("itemC", Item.class);

		Stream.of(itemA, itemB, itemC).forEach(System.out::println);

		System.out.println("/////////////// --- Bean Overview --- ////////////////");
		ClientService clientService = context.getBean("clientService", ClientService.class);
		clientInfo();

		System.out.println("/////////////// --- Bean Scope LifeCycle --- ////////////////");
		ItemService serviceA = context.getBean("itemService", ItemService.class);
		ItemService serviceB = context.getBean("itemService", ItemService.class);

		// single, prototype
		System.out.println("serviceA: " + serviceA);
		System.out.println("serviceB: " + serviceB);

		context.close();
	}
}
