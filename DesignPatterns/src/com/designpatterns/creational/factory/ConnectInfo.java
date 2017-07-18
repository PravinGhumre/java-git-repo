package com.designpatterns.creational.factory;

public class ConnectInfo {
	
	private String databaseDriverName;
	private int connectionUrl;

	public String getDatabaseDriverName() {
		return databaseDriverName;
	}

	public void setDatabaseDriverName(String databaseDriverName) {
		this.databaseDriverName = databaseDriverName;
	}

	public int getConnectionUrl() {
		return connectionUrl;
	}

	public void setConnectionUrl(int connectionUrl) {
		this.connectionUrl = connectionUrl;
	}

}
