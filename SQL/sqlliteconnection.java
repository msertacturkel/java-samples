import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class sqlliteconnection{
    public static void main(String[] args){
          Connection connection=null;
          ResultSet resultset=null;
          Statement statement=null;
          try{
              // String path = OsSpecificseperator.getPath(Platform.getInstallLocation().getURL().getPath());
               Class.forName("org.sqlite.JDBC");
               connection=DriverManager.getConnection("jdbc:sqlite:/media/DEPO/Java_Kutuphanem/vegorfruit");
               statement=connection.createStatement();
               resultset=statement.executeQuery("select * from fruits");
               while(resultset.next()){
                    System.out.println(resultset.getString("fruits"));
               
                }
          }
          catch(Exception e){
                e.printStackTrace();
                System.out.println("DB : Connection: " + e.getMessage());
                return;
          }finally
               {
               try{
                resultset.close();
                statement.close();
                connection.close();
               }
               catch(Exception e){
                    e.printStackTrace();
                    }
               }
          }
    }

