package com.designpatterns.creational.singleton;

public class AppConfig implements Cloneable {

	private static AppConfig instance = null;

	// private constructor
	private AppConfig() {
		// load the application configuration
		loadAppConfig();
	}

	// loads the application configuration xml
	private void loadAppConfig() {
		//
	}

	public static synchronized AppConfig getInstance() {
		if (null == instance) {
			instance = new AppConfig();
		}
		return instance;
	}

	public Object clone() throws CloneNotSupportedException {

		return new CloneNotSupportedException();
	}

}
