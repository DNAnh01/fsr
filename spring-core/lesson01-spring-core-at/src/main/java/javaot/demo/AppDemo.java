package javaot.demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javaot.config.AppConfig;
import javaot.service.MovieRecommender;

public class AppDemo {

	private static Class<AppConfig> LOCATION = AppConfig.class;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(LOCATION);
		System.out.println("\u001B[33m" + "App is working!!" + "\u001B[0m");
		System.out.println("\u001B[32m" + "App is working!!" + "\u001B[0m");
		System.out.println("\u001B[34m" + "App is working!!" + "\u001B[0m");
//		ContextUtils.showBeansName(context);	
		MovieRecommender mr = context.getBean("movieRecommender", MovieRecommender.class);
		mr.recommend();
		context.close();
	}
}
