package javaot.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

// Step 2: create Advice
// Advice invoked during a method is invoked. 
public class MovieAspectAroundAdvice implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		System.out.println("----------- Advice before#" + invocation.getMethod().getName());
		
		Object result = invocation.proceed(); // call joint point
		
		System.out.println("----------- Advice after#" + invocation.getMethod().getName());
		
		return result;
	}

}
