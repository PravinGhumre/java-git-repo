package com.designpatterns.creational.factory;

public abstract class ResourceAccessorFactory {

	public abstract ResourceAccessor createInstance(int resourceType);

}