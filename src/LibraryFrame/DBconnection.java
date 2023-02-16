package LibraryFrame;
import java.sql.*;
/**
 *
 * @author 227001
 */
public class DBconnection {
    
  Connection con;
  Statement st;
    
    DBconnection(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","pass");
        st=con.createStatement();
        
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String args[]){
        new DBconnection();
    }
}
