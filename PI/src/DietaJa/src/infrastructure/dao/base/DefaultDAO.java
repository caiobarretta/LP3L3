package infrastructure.dao.base;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import core.entities.base.Entity;

public abstract class DefaultDAO<TEntity extends Entity> {
	
	protected abstract List<TEntity> LoadEntityFromResultSet(ResultSet rs) throws SQLException;

	protected List<TEntity> executeQuery(String query) {
		ResultSet rs = null;
        Connection connection = null;
        Statement statement = null; 
        List<TEntity> result = null;
         
        //String query = "show databases;";
        try {           
        	connection = DAOConnection.getConnection();
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
            result = LoadEntityFromResultSet(rs);
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
        return result;
	}
}
