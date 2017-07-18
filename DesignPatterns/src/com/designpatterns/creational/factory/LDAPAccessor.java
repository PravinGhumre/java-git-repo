package com.designpatterns.creational.factory;

public class LDAPAccessor implements ResourceAccessor {
	public boolean connect(ConnectInfo resourceInfo) {
		// connect to resource
		return true;
	}

	public ResultsBatchProcessor query(String query) {
		// fetch query results

		return new ResultsBatchProcessor();
	}

	public void close() {
		// close connection
	}
}
