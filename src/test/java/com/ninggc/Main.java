package com.ninggc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static final String debugBean = "life";

	public static void main(String[] args) {
		AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext("com.ninggc");
		BeanFactory beanFactory;
	}
}
