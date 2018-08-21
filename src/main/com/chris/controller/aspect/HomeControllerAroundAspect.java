package com.chris.controller.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Auther Chris Lee
 * @Date 8/8/2018 17:05
 * @Description
 */
@Aspect
@Component
public class HomeControllerAroundAspect {
	
	@Pointcut("execution(* com.chris.controller.HomeController.home(..))")
	public void sayHello() {
	}
	
	@Around("sayHello()")
	public void aroundNotification(ProceedingJoinPoint jp) {
		System.out.println("who:");
		System.out.println("isFamiliar:");
		try {
			jp.proceed();
		}
		catch (Throwable throwable) {
            System.out.println("refound:");
		}
		System.out.println("haveDinner:");
		System.out.println("walkAway:");
	}
	
}
