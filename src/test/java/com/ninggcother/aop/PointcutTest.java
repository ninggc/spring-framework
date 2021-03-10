package com.ninggcother.aop;

import com.ninggc.LifeCycle;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Aspect
@EnableAspectJAutoProxy(exposeProxy = true, proxyTargetClass = false)
@ComponentScan("com.ninggcother.aop")
public class PointcutTest {

	// @Around("* com.ninggc.LifeCycle..*(()")
	// @Around(value = "execution(* com.ninggc.LifeCycle.doAop())", argNames = "proceedingJoinPoint")
	@Around(value = "execution(* com.ninggcother.aop..*.*(..))", argNames = "proceedingJoinPoint")
	public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		try {
			Object proceed = proceedingJoinPoint.proceed();
			return proceed;
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			throw throwable;
		}
	}

	public static void main(String[] args) {
		// AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PointcutTest.class, LifeCycle.class);
		try {

			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PointcutTest.class);
			// context.registerBean(PointcutTest.class);
			// context.registerBean(AopServiceImpl.class);
			// context.registerBean(AopServiceImpl2.class);

			context.refresh();

			System.out.println("");

			// context.getBean(PointcutTest.class);
			// context.getBean("pointcutTest");
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		} finally {
			System.out.println("");
		}

	}
}
