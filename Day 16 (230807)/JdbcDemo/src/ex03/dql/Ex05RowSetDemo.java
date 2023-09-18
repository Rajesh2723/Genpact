package ex03.dql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

import util.DBUtils;

public class Ex05RowSetDemo {

	public static void main(String[] args) {
		String fetchQuery = "SELECT _id, name, salary FROM employee";

		try (Connection c = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PWD);
				Statement stmt = c.createStatement();) {

			// Factory pattern-Its task is to provide appropriate child class implementation
			// at run time
			
//			import javax.sql.rowset.CachedRowSet;
//			import javax.sql.rowset.RowSetProvider;
			CachedRowSet cachedRowSet = RowSetProvider.newFactory().createCachedRowSet();
			
			cachedRowSet.setUrl(DBUtils.URL);
			cachedRowSet.setUsername(DBUtils.USER);
			cachedRowSet.setPassword(DBUtils.PWD);
			
			cachedRowSet.setCommand(fetchQuery);
			
			cachedRowSet.execute();
			
			while(cachedRowSet.next()) {
				int id = cachedRowSet.getInt("_id");
				String name = cachedRowSet.getString("name");
				double salary = cachedRowSet.getDouble("salary");
					
				System.out.println(id + ", " + name + ", " + salary);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
