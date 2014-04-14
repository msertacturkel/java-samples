
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.StringTokenizer;

public class DBInfo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Driver tanimlama
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			//System.out.println("surucu var");
			String user = "";
			String password = "";
			String url = "jdbc:odbc:deneme";
			Connection con = DriverManager.getConnection(url, user, password);
			//System.out.println("baglandim..");
			DatabaseMetaData dbmd = con.getMetaData();
			System.out.println("DB Hakkinda bilgi..");
			//System.out.println(dbmd.getDatabaseMajorVersion());
			//System.out.println(dbmd.getDatabaseMinorVersion());
			System.out.print(dbmd.getDatabaseProductName()+" ");
			System.out.print(dbmd.getDatabaseProductVersion()+" ");
			System.out.print(dbmd.getDriverMajorVersion()+".");
			System.out.println(dbmd.getDriverMinorVersion());
			String sqlKW=dbmd.getSQLKeywords();
			StringTokenizer st=new StringTokenizer(sqlKW,",");
			System.out.println("Standart olmayan SQL Ifadeleri..");
			System.out.println("--------------");
			while(st.hasMoreTokens())
				System.out.println(st.nextToken());
			System.out.println();
			System.out.println("Tablolar..");
			System.out.println("-----------------");
			ResultSet tables = dbmd.getTables(null, null, null, new String[]{"TABLE"});
			while(tables.next()){
				String tableName=tables.getString(3);
				System.out.println(tableName);
				System.out.println("----------");
				String sql="select * from "+tableName;
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				ResultSetMetaData rsmd=rs.getMetaData();
				int sutun=rsmd.getColumnCount();
				for(int i=1;i<=sutun;i++)
					System.out.println(rsmd.getColumnName(i));
				System.out.println("------------");
				System.out.println();
				
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
