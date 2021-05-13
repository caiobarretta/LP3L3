package infrastructure.dao.base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOConnection {
	//Padrão de Singleton
    private static DAOConnection instance = new DAOConnection();
    private static final String URL = "jdbc:mysql://localhost:3306/test";
    private static final String USER = "dietaja";
    private static final String PASSWORD = "dietaja";
    private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver"; 
     
    private DAOConnection() {
        try {
            //Step 2: Load MySQL Java driver
            Class.forName(this.DRIVER_CLASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
     
    private Connection createConnection() {
    	 
        Connection connection = null;
        try {
            //Step 3: Establish Java MySQL connection
            connection = DriverManager.getConnection(this.URL, this.USER, this.PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }   
     
    public static Connection getConnection() {
        return instance.createConnection();
    }
}