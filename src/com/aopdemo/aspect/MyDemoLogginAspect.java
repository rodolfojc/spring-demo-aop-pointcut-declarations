package com.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLogginAspect {
	
	//RELATED ADVICES FOR LOGGING
	
	//@BEFORE
	@Before("execution(* com.aopdemo.dao.*.*(..))")
	public void beforeAddAccountAdvice() {
		
		System.out.println("Executing @Before advice on addAccount()");
		
	}

}
