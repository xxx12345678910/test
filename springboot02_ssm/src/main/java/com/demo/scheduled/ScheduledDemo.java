package com.demo.scheduled;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class ScheduledDemo {

	public void show() {
		System.out.println("定时器被触发"+new Date());
	}
}
