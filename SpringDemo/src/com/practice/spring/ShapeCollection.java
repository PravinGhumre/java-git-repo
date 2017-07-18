package com.practice.spring;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ShapeCollection implements ApplicationContextAware, BeanNameAware {

	private ApplicationContext applicationContext = null;
	private List<String> shapeOfList;
	private Set<String> shapeOfSet;
	private Map<String, String> shapeOfMap;
	private Properties shapeOfProperties;

	/**
	 * @param shapeOfList
	 *            the shapeOfList to set
	 */
	public void setShapeOfList(List<String> shapeOfList) {
		this.shapeOfList = shapeOfList;
	}

	/**
	 * @param shapeOfSet
	 *            the shapeOfSet to set
	 */
	public void setShapeOfSet(Set<String> shapeOfSet) {
		this.shapeOfSet = shapeOfSet;
	}

	/**
	 * @param shapeOfMap
	 *            the shapeOfMap to set
	 */
	public void setShapeOfMap(Map<String, String> shapeOfMap) {
		this.shapeOfMap = shapeOfMap;
	}

	/**
	 * @param shapeOfProperties
	 *            the shapeOfProperties to set
	 */
	public void setShapeOfProperties(Properties shapeOfProperties) {
		this.shapeOfProperties = shapeOfProperties;
	}

	public String toString() {
		return "List Elements :" + shapeOfList + "\nSet Elements :"
				+ shapeOfSet + "\n" + "Map Elements :" + shapeOfMap
				+ "\nProperty Elements :" + shapeOfProperties;

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("setBeanName == >>> " + beanName);
	}

}