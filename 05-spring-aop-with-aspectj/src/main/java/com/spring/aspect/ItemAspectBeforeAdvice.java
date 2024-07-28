package com.spring.aspect;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

// step 2: create advice
public class ItemAspectBeforeAdvice implements MethodBeforeAdvice {
	/**
	 * @param method: join point method info
	 * @param args: list args of join point method
	 * @param target: proxy ...
	 * @throws Throwable: exception
	 */
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println(">>>> ItemAspectBeforeAdvice#before " + method.getName());
	}
}
