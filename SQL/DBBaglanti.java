

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBBaglanti {

	public static void main(String[] args) {
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			System.out.println("driver var");
			String url="jdbc:odbc:test";//DSN'de tanimlandi
			String user="";
			String password="";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("veritabanina baglandi..");
			DatabaseMetaData dbmd = con.getMetaData();
			System.out.println(dbmd.getDriverName());
			System.out.println(dbmd.getDatabaseProductName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
