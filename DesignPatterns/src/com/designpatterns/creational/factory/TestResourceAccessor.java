package com.designpatterns.creational.factory;

public class TestResourceAccessor {
	public void test() {
		
		ResourceAccessorFactory raf = new ResourceAccessorFactoryImpl();
		ResourceAccessor accessor = raf.createInstance(ResourceInfo.TYPE_LDAP);

		accessor.connect(new ConnectInfo());

		accessor.query("");
		accessor.close();
	}
}
