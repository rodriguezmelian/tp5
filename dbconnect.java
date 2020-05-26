package dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class dbconnect {

    private static dbconnect single_instance = null;

    public static final String URL = "jdbc:mysql://localhost:3306/agenda?true&useSSL=false";
    public static final String USER = "root";
    public static final String PASSWORD = "password";

    public Statement st;
    
    
    public dbconnect() {

        try {
          
            Connection mycon = DriverManager.getConnection(URL,"root", "password");
            st = mycon.createStatement();
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

        public static dbconnect getInstance() {
        if (single_instance == null)
            single_instance = new dbconnect();

        return single_instance;
    }
        
}
