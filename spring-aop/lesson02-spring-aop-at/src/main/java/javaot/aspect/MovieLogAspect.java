package javaot.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MovieLogAspect {
	
	@Before("execution(* javaot.service.MovieService.addMovie(..))")
	public void beforeAddMovie(JoinPoint joinPoint) {
		System.out.println("MovieLogAspect # Before");
	}
	
	@After("execution(* javaot.service.MovieService.addMovie(..))")
	public void afterAddMovie(JoinPoint joinPoint) {
		System.out.println("MovieLogAspect # After");
	}
}
