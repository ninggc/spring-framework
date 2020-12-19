package com.ninggcother.aop;

import com.ninggc.LifeCycle;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Aspect
@EnableAspectJAutoProxy(exposeProxy = true, proxyTargetClass = true)
public class PointcutTest {
	// @Around("* com.ninggc.LifeCycle..*(()")
	@Around(value = "execution(* com.ninggc.LifeCycle.doAop())", argNames = "proceedingJoinPoint")
	public void around(ProceedingJoinPoint proceedingJoinPoint) {
		try {
			Object proceed = proceedingJoinPoint.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PointcutTest.class, LifeCycle.class);
		LifeCycle lifeCycle = context.getBean(LifeCycle.class);
		lifeCycle.doAop();
	}
}
