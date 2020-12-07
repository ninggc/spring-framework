package com.ninggc;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FactoryBeanTest implements FactoryBean {
	@Autowired
	LifeCycle lifeCycle;

	@Override
	public Object getObject() throws Exception {
		return new FactoryBeanTestInner();
	}

	@Override
	public Class<?> getObjectType() {
		return FactoryBeanTestInner.class;
	}

	public static class FactoryBeanTestInner {

	}
}
