package com.chris.controller.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Auther Chris Lee
 * @Date 8/8/2018 17:05
 * @Description
 */
@Aspect
@Component
public class HomeControllerAspect {
	
	@Before("execution(* com.chris.controller.HomeController.home(..))")
	public void who() {
		System.out.println("who:");
	}
	
	@Before("execution(* com.chris.controller.HomeController.home(..))")
	public void isFamiliar() {
		System.out.println("isFamiliar:");
	}
	
	@After("execution(* com.chris.controller.HomeController.home(..))")
	public void haveDinner() {
		System.out.println("haveDinner:");
	}
	
	@AfterReturning("execution(* com.chris.controller.HomeController.home(..))")
	public void walkAway() {
		System.out.println("walkAway:");
	}
}
