package com.designpatterns.creational.singleton;

public class StaticBlockSingleton {
	
	private static StaticBlockSingleton instance;

	private StaticBlockSingleton() {
	}

	// static block initialization for exception handling
	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException(
					"Exception occured in creatingsingleton instance");
		}
	}

	public static StaticBlockSingleton getInstance() {
		return instance;
	}
}
