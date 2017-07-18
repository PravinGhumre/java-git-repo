package com.practice.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;

public class Circle implements InitializingBean, DisposableBean,
		ApplicationContextAware, BeanNameAware {

	private Point center;
	private ApplicationContext applicationContext = null;
	@Autowired
	private MessageSource messageSource;

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
		System.out.println("setCenter !!!");
	}

	public void draw() {
		System.out.println("drawing circle  X : " + this.center.getX()
				+ ",  Y : " + this.center.getY());
		System.out.println(" Messages FirstName =>>"
				+ this.messageSource.getMessage("employee.myFirstName", null,
						"Default Pravin", null));
		System.out.println(" Messages LastName =>>"
				+ this.messageSource.getMessage("employee.myLastName", null,
						"Default Ghumre", null));
	}

	public void myInit() {
		System.out.println("myInit !!!");
	}

	public void myDestroy() {
		System.out.println("myDestroy !!!");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet !!!");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy !!!");
	}

	public void defaultInit() {
		System.out.println("defaultInit !!!");
	}

	public void defaultDestroy() {
		System.out.println("defaultDestroy !!!");
	}

	@PostConstruct
	public void javaInit() {
		System.out.println("javaInit !!!");
	}

	@PreDestroy
	public void javaDestroy() {
		System.out.println("javaDestroy !!!");
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("setBeanName " + beanName);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
		System.out.println("setApplicationContext " + applicationContext);
	}

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
}
