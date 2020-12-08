package com.ninggc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;
import org.springframework.core.annotation.AliasFor;

@Configuration
@Lazy(value = false)
@Primary
// @DependsOn(value = "lifeCycle")
@Role(BeanDefinition.ROLE_APPLICATION)
@Description("configTest")
public class ConfigurationTest {
	// @Autowired
	// LifeCycle lifeCycle;

	@Bean(name = {"cti", "cti2"})
	public ConfigurationTestInner configurationTestInner() {
		return new ConfigurationTestInner();
	}

	@Bean(initMethod = "initMethod", destroyMethod = "desMethod")
	public LifeCycle lifeCycle() {
		return new LifeCycle();
	}

	public static class ConfigurationTestInner {

	}
}
