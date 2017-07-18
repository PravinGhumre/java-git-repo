package com.designpatterns.creational.factory;

public class ResourceAccessorFactoryImpl extends ResourceAccessorFactory {

	public ResourceAccessor createInstance(int resourceType) {
		ResourceAccessor resourceAccessor = null;
		if (resourceType == ResourceInfo.TYPE_LDAP) {
			resourceAccessor = new LDAPAccessor();
		} else if (resourceType == ResourceInfo.TYPE_DATABASE) {
			resourceAccessor = new DatabaseAccessor();
		} else {
			throw new RuntimeException("Bad resource type");
		}
		return resourceAccessor;
	}

}
