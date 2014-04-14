import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import oracle.jdbc.driver.*;
class OracleDG{
	   
	public static void main(String arg[]){
		try{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@java:1521:dernek","scott","tiger");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from emp");
			ResultSetMetaData rsmd=rs.getMetaData();
			int sutun=rsmd.getColumnCount();
			Vector rowData=new Vector();
			Vector kayit,sutunAdi;
			sutunAdi=new Vector();
			for(int i=1;i<=sutun;i++)
				sutunAdi.addElement(rsmd.getColumnName(i));
			while(rs.next()){//tikkat
				kayit=new Vector();
				for(int i=1;i<=sutun;i++)
					        kayit.addElement(rs.getString(i)); 
				rowData.addElement(kayit);	        
				}//while
				JFrame fr=new JFrame("Sorgu Sonucu");	
				Container cons=fr.getContentPane();
				JTable tablo=new JTable(rowData,sutunAdi);
				
				cons.add(new JScrollPane(tablo));
				fr.setBounds(20,20,302,302);
				fr.setVisible(true);
				
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
	 //public JTable (java.util.Vector rowData, java.util.Vector columnNames); 
}