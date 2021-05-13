package infrastructure;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import infrastructure.dao.DiasdaSemanaDAO;

public class TesteDAO {
	public static void main(String[] args) {
        	DiasdaSemanaDAO teste = new DiasdaSemanaDAO();
        	teste.get(0);
    }
 
    public static void testConnection()  {      
        ResultSet rs = null;
        Connection connection = null;
        Statement statement = null; 
         
        String query = "show databases;";
        try {           
        	connection = JDBCMySQLConnection.getConnection();
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
            	String dataBaseName = rs.getString("Database");
            	System.out.println("Database:" + dataBaseName);
            }
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    protected static ResultSet executeQuery() {
		ResultSet rs = null;
        Connection connection = null;
        Statement statement = null; 
         
        String query = "show databases;";
        try {           
        	connection = JDBCMySQLConnection.getConnection();
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return rs;
	}
}
