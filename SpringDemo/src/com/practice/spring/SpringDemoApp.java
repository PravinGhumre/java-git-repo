package com.practice.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SuppressWarnings("resource")
public class SpringDemoApp {

	public static void main(String[] args) {

		AbstractApplicationContext context = new FileSystemXmlApplicationContext(
				"classpath:com/practice/spring/application-context.xml");

		System.out.println("context " + context);
		context.registerShutdownHook();
		Circle circle = (Circle) context.getBean("circle");
		circle.draw();

		// Collection Coding
		/*
		 * ShapeCollection shapeCollection = (ShapeCollection) context
		 * .getBean("shapeCollection"); System.out.println(shapeCollection);
		 */
	}
}
