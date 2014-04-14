import java.io.*;
import java.sql.*;
import oracle.jdbc.driver.*;
class OracleTest{
	public static void main(String arg[]){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@java:1521:dernek","scott","tiger");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from emp");
			ResultSetMetaData rsmd=rs.getMetaData();
			int sutun=rsmd.getColumnCount();
			while(rs.next()){
				for(int i=1;i<=sutun;i++)
					System.out.print(rs.getString(i)+"  ");
				System.out.println()	;
				}
			//CallableStatement cs=con.prepareCall("{call sp_interest(?,?)}");
	//cs.registerOutParameter(2,Types.FLOAT);
	//cs.setInt(1,7900);
	//cs.execute();
	//System.out.println("Son maasi "+cs.getFloat(2));
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}