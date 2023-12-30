package javaot.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

// Step 2: create Advice
// Advice invoked before a method is invoked. 
// Such advice cannot prevent the method call proceeding, unless they throw a Throwable.
public class MovieAspectBeforeAdvice implements MethodBeforeAdvice{
	@Override
	/**
	 * method -> joint point method method
	 * args   -> list args of joint point
	 * target -> proxy ..
	 */
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("-------------------");
		System.out.println(">>>>>MovieAspectBeforeAdvice " + method.getName());
		System.out.println("-------------------");
	}
}
