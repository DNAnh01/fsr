package com.spring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

// Step 2: Create Advice
public class MovieAopBeforeAdvice implements MethodBeforeAdvice {
	/**
	 * @param method: JoinPoint method info
	 * @param args:   list arguments of JoinPoint method
	 * @param target: proxy ...
	 */
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// advice(method) run before JoinPoint
		System.out.println("\n==========================");
		System.out.println("***** MovieAopBeforeAdvice >> BEFORE >> " + method.getName());
	}
}
