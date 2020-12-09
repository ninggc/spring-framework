package com.ninggc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@PropertySource("ninggc.properties")
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
public class Main {
	public static final String debugBean = "life";

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.ninggc");
		context.close();
		LifeCycle lifeCycle = context.getBean(LifeCycle.class);
	}
}
