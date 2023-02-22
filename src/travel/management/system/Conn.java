
package travel.management.system;
import java.sql.*;
public class Conn {
  
       Connection c;
       Statement s;
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); // step  1 registering the driver
            c = DriverManager.getConnection("jdbc:mysql:///travism", "root", "Avic@2509"); // to establish connection with mysql
            s = c.createStatement();
        }
    catch(Exception e){
        e.printStackTrace();
    }
}
}
 

// JDBC is used to run mysql queries using java