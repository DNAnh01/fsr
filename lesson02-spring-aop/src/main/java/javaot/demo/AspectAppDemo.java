package javaot.demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javaot.service.MovieService;

public class AspectAppDemo {
	
	private static final String LOCATION = "aspect-auto-proxy.xml";
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(LOCATION);
		
//		printBeans(context);
		
		MovieService movieService = context.getBean("movieService", MovieService.class);
		
//		movieService.printName();
		movieService.printCatalog();
		context.close();
	}
//	private static void printBeans(ConfigurableApplicationContext context) {
//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
//	}
}
