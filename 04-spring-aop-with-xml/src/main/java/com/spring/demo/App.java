package com.spring.demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.MovieService;

import java.util.Arrays;

public class App {
	private static final String PATH = "aop-second.xml";

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(PATH);
		printBeans(context);
		// print all bean name in context

		// Get bean proxy and return join point type at runtime
		MovieService service = context.getBean("movieServiceProxy", MovieService.class);

		// Auto proxy
		// MovieService service = context.getBean("movieService", MovieService.class);
		/*
		 * #JOIN POINT MovieService printName >> Avatar
		 * #JOIN POINT MovieService printCatalog >> Adventure
		 */
		service.printName();
		service.printCatalog();
		context.close();
	}
	
	private static void printBeans(ConfigurableApplicationContext context) {
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}
}
