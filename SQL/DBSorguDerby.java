

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DBSorguDerby {

	public static void main(String[] args) {
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			String url = "jdbc:derby://localhost:1527/sample";// 
			String user = "app";
			String password = "app";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("baglandi..");
			Statement stmt = con.createStatement();
			String sql = "select * from ogrenci";
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			int sutunSay = rsmd.getColumnCount();
			for(int i=1;i<=sutunSay;i++)
				System.out.print(rsmd.getColumnName(i)+"\t");
			System.out.println();//satir atlatma
			while(rs.next()){//satir satir okunuyor
				for(int i=1;i<=sutunSay;i++)//satir  icindeki sutunlari tariyor
					System.out.print(rs.getString(i)+"\t");
				System.out.println();//satir atlatma
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
