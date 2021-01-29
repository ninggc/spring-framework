package com.ninggcother.aop;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("a1")
public class AopServiceImpl implements AopService, BeanPostProcessor {
	@Resource(name = "a2")
	AopService aopService;

	public AopServiceImpl() {
		System.out.println("");
	}

	@Override
	public void doAop() {

	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof AopServiceImpl) {
			return new AopServiceImpl();
		}
		return bean;
	}
}
