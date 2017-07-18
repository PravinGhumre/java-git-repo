package com.designpatterns.creational.singleton;

public class InvokeSingleton {
	public static void main(String[] args) throws CloneNotSupportedException {

		AppConfig appConfigOne = AppConfig.getInstance();
		
		System.out.println("-appConfigOne-->> " + appConfigOne.hashCode());
		
		Object clone = appConfigOne.clone();
		
		System.out.println("--->> " + clone.hashCode());

		AppConfig appConfigTwo = AppConfig.getInstance();
	}
}
