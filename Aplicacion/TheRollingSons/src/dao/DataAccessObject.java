package dao;

import bd.DataBase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataAccessObject {
<<<<<<< HEAD
	protected static final String DRIVER = "com.mysql.cj.jdbc.Driver";
<<<<<<< HEAD
	protected static final String URL = "jdbc:mysql://localhost/primaria?serverTimezone=UTC";
=======
	protected static final String URL = "jdbc:mysql://localhost/therollingsons?serverTimezone=UTC";
>>>>>>> appv0.01
	protected static final String USER = DataBase.Conexion.getUser();
	protected static final String PASSWORD = DataBase.Conexion.getPassword();
	private Connection connection = null;
	public DataAccessObject() throws ClassNotFoundException, SQLException{
		Class.forName(DRIVER);
		connection = DriverManager.getConnection(URL, USER, PASSWORD);
<<<<<<< HEAD
		// System.out.println("DataAccessObject.openConnection() - Database connection has been opened");
=======
>>>>>>> appv0.01
	}   
	public Statement createStatement() throws SQLException, DAOInitializationException{
		if(connection == null || connection.isClosed()){
			throw new DAOInitializationException("DAO was previously closed.");
		}else{
			return connection.createStatement();
		}
	}
<<<<<<< HEAD
	/* ********************************************************************* *
	 *                                                                       *
	 * ********************************************************************* */
=======
>>>>>>> appv0.01
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
<<<<<<< HEAD
	/* ********************************************************************* *
	 *                                                                       *
	 * ********************************************************************* */
=======
>>>>>>> appv0.01
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
<<<<<<< HEAD
			// System.out.println("DataAccessObject.closeConnection() - Database connection has been closed");
=======
>>>>>>> appv0.01
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
<<<<<<< HEAD
	/* ********************************************************************* *
	 *                                                                       *
	 * ********************************************************************* */
=======
>>>>>>> appv0.01
	public Connection getConnection() throws SQLException, ClassNotFoundException, DAOInitializationException
	{
		System.out.println("DataAccessObject.getConnection()");
		if(connection == null || connection.isClosed())
		{
			throw new DAOInitializationException("DAO was previously closed.");
		}
		return connection;
	}
<<<<<<< HEAD
	/* ********************************************************************* *
	 *                                                                       *
	 * ********************************************************************* */

=======
>>>>>>> appv0.01
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
<<<<<<< HEAD
		// System.out.println("DataAccessObject.closeStatement() - Database statement has been closed");
	}
	/* ********************************************************************* *
	 *                                                                       *
	 * ********************************************************************* */
=======
	}
>>>>>>> appv0.01
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
<<<<<<< HEAD
		// System.out.println("DataAccessObject.closeResultSet() - Database resultSet has been closed");
	}
	/* ********************************************************************* *
	 *                                                                       *
	 * ********************************************************************* */
=======
	}
>>>>>>> appv0.01
}
=======

    protected static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    protected static final String URL = "jdbc:mysql://localhost:3306/therollingsons?serverTimezone=UTC";
    protected static final String USER = DataBase.Conexion.getUser();
    protected static final String PASSWORD = DataBase.Conexion.getPassword();
    private Connection connection = null;

    public DataAccessObject() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        connection = DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public Statement createStatement() throws SQLException, DAOInitializationException {
        if (connection == null || connection.isClosed()) {
            throw new DAOInitializationException("DAO was previously closed.");
        } else {
            return connection.createStatement();
        }
    }

    public PreparedStatement prepareStatement(String sql) throws SQLException, DAOInitializationException {
        if (connection == null || connection.isClosed()) {
            throw new DAOInitializationException("DAO was previously closed.");
        } else {
            return connection.prepareStatement(sql);
        }
    }

    public void closeConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                throw new DAOInitializationException("DAO was previously closed.");
            } else {
                connection.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLException, ClassNotFoundException, DAOInitializationException {
        System.out.println("DataAccessObject.getConnection()");
        if (connection == null || connection.isClosed()) {
            throw new DAOInitializationException("DAO was previously closed.");
        }
        return connection;
    }

    public void closeStatement(Statement stmt) throws SQLException, DAOInitializationException {
        if (connection == null || connection.isClosed()) {
            throw new DAOInitializationException("DAO was previously closed.");
        }

        if (stmt != null && !stmt.isClosed()) {
            stmt.close();
        }
    }

    public void closeResultSet(ResultSet rs) throws SQLException, DAOInitializationException {
        if (connection == null || connection.isClosed()) {
            throw new DAOInitializationException("DAO was previously closed.");
        }

        if (rs != null && !rs.isClosed()) {
            rs.close();
        }
    }
}
>>>>>>> appv0.01
