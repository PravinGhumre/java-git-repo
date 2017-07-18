package com.designpatterns.creational.factory;

public interface ResourceAccessor {
	
	public boolean connect(ConnectInfo resourceInfo);
	public ResultsBatchProcessor query(String query);
	public void close();
}