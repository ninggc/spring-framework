package com.ninggc.event;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executors;

@Component("applicationEventMulticaster")
public class EventConfiguration extends SimpleApplicationEventMulticaster {
	public EventConfiguration() {
		setTaskExecutor(Executors.newCachedThreadPool());
	}
}
