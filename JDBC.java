
import com.mysql.cj.protocol.Resultset;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {
    static Connection con;

    public static Connection CreateC() {

           try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            String user="root";
            String password="a1b2c3d4.";
            String url="jdbc:mysql://localhost:3306/grp_project";
            con =DriverManager.getConnection(url,user,password);
                Statement statement=con.createStatement();




        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
           return con;
    }
}