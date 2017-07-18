package com.designpatterns.structural.facade;

public class MySqlHelper {

	public static Connection getMySqlDBConnection() {
		System.out.println("---->> MySql DB Connection !!! ");
		return new Connection();

	}

	public void generateMySqlPDFReport(String tableName, Connection con) {
		System.out.println("---->>MySqlPDFReport !!! ");
	}

	public void generateMySqlHTMLReport(String tableName, Connection con) {
		System.out.println("---->> MySqlHTMLReport !!! ");
	}

}
