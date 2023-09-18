package ex03.dql;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

import util.DBUtils;

public class Ex01DatabaseMetadata {

	public static void main(String[] args) {

		try (Connection c = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PWD);) {

			DatabaseMetaData dbMetaData = c.getMetaData();

			String dbProductName = dbMetaData.getDatabaseProductName();
			String dbProductVersion = dbMetaData.getDatabaseProductVersion();
			String driverName = dbMetaData.getDriverName();
			String driverVersion = dbMetaData.getDriverVersion();

			int maxConnections = dbMetaData.getMaxConnections();

			System.out.println("\n dbProductName : " + dbProductName);
			System.out.println("\n dbProductVersion : " + dbProductVersion);
			System.out.println("\n driverName : " + driverName);
			System.out.println("\n driverVersion : " + driverVersion);
			System.out.println("\n maxConnections : " + maxConnections);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
