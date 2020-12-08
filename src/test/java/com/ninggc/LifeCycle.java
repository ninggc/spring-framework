package com.ninggc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

// @Component
public class LifeCycle implements BeanPostProcessor, InitializingBean, DisposableBean, MergedBeanDefinitionPostProcessor {
	@Autowired
	ConfigurationTest configurationTest;
	@Resource
	ConfigurationTest configurationTest1;

	@PostConstruct
	public void postC() {
		System.out.println("postC");
	}

	@PreDestroy
	public void preD() {
		System.out.println("preD");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterP");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("ppbi");
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("ppai");
		return null;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("des");
	}

	public void initMethod() throws Exception {
		System.out.println("init-method");
	}

	public void desMethod() throws Exception {
		System.out.println("des-method");
	}

	@Override
	public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
		System.out.println("ppmbd");
	}
}
