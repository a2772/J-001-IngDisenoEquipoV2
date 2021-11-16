package dao;

import bd.DataBase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataAccessObject {
	protected static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	protected static final String URL = "jdbc:mysql://localhost/therollingsons?serverTimezone=UTC";
	protected static final String USER = DataBase.Conexion.getUser();
	protected static final String PASSWORD = DataBase.Conexion.getPassword();
	private Connection connection = null;
	public DataAccessObject() throws ClassNotFoundException, SQLException{
		Class.forName(DRIVER);
		connection = DriverManager.getConnection(URL, USER, PASSWORD);
	}   
	public Statement createStatement() throws SQLException, DAOInitializationException{
		if(connection == null || connection.isClosed()){
			throw new DAOInitializationException("DAO was previously closed.");
		}else{
			return connection.createStatement();
		}
	}
	public PreparedStatement prepareStatement(String sql) throws SQLException, DAOInitializationException
	{
		if(connection == null || connection.isClosed())
		{
			throw new DAOInitializationException("DAO was previously closed.");
		}
		else
		{
			return connection.prepareStatement(sql);
		}
	}
	public void closeConnection()
	{
		try
		{
			if(connection == null || connection.isClosed())
			{
				throw new DAOInitializationException("DAO was previously closed.");
			}
			else
			{
				connection.close();
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public Connection getConnection() throws SQLException, ClassNotFoundException, DAOInitializationException
	{
		System.out.println("DataAccessObject.getConnection()");
		if(connection == null || connection.isClosed())
		{
			throw new DAOInitializationException("DAO was previously closed.");
		}
		return connection;
	}
	public void closeStatement(Statement stmt) throws SQLException, DAOInitializationException
	{
		if(connection == null || connection.isClosed())
		{
			throw new DAOInitializationException("DAO was previously closed.");
		}
		
		if(stmt != null && !stmt.isClosed())
		{
			stmt.close();
		}
	}
	public void closeResultSet(ResultSet rs) throws SQLException, DAOInitializationException
	{
		if(connection == null || connection.isClosed())
		{
			throw new DAOInitializationException("DAO was previously closed.");
		}
		
		if(rs != null && !rs.isClosed())
		{
			rs.close();
		}
	}
}