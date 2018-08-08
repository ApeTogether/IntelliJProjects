package com.chris.controller.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Auther Chris Lee
 * @Date 8/8/2018 17:05
 * @Description
 */
@Aspect
@Component
public class HomeControllerAspect2 {
	
	@Pointcut("execution(* com.chris.controller.HomeController.home(..))")
	public void sayHello() {
	}
	
	@Before("sayHello()")
	public void who() {
		System.out.println("who:");
	}
	
	@Before("sayHello()")
	public void isFamiliar() {
		System.out.println("isFamiliar:");
	}
	
	@After("sayHello()")
	public void haveDinner() {
		System.out.println("haveDinner:");
	}
	
	@AfterReturning("sayHello()")
	public void walkAway() {
		System.out.println("walkAway:");
	}
}
