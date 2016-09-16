package com.sia.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sia.model.Knight;

public class KnightsMain {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"knights.xml");
		Knight knight = context.getBean(Knight.class);
		knight.embarkQuest();
	}
}
