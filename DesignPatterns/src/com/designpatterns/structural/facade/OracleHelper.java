package com.designpatterns.structural.facade;

public class OracleHelper {

	public static Connection getOracleDBConnection() {
		System.out.println("---->> Oracle DB Connection !!! ");
		return new Connection();

	}

	public void generateOraclePDFReport(String tableName, Connection con) {
		System.out.println("---->>OraclePDFReport !!! ");
	}

	public void generateOracleHTMLReport(String tableName, Connection con) {
		System.out.println("---->> OracleHTMLReport !!! ");
	}
}
