package com.ninggcother.aop;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("a2")
public class AopServiceImpl2 implements AopService {

	@Resource(name = "a1")
	AopService aopService;

	@Override
	public void doAop() {

	}
}
