package com.designpatterns.creational.singleton;

import java.io.Serializable;

public class PerfectSingleton implements Serializable, Cloneable {

	private static final long serialVersionUID = -7604766932017737115L;
	private static PerfectSingleton INSTANCE;

	private PerfectSingleton() {
	}

	public static PerfectSingleton getInstance() {

		if (INSTANCE == null) {
			synchronized (PerfectSingleton.class) {
				if (INSTANCE == null) {
					INSTANCE = new PerfectSingleton();
				}
			}
		}

		return INSTANCE;
	}

	protected Object readResolve() {
		return getInstance();
	}

	@Override
	public Object clone() {
		return getInstance();
	}
}
