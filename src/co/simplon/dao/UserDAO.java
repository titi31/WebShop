package co.simplon.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.simplon.entities.Users;
public class UserDAO extends DAOContext {

	public static Users isValidLogin( String login, String password ) {
		try ( Connection connection = DriverManager.getConnection( dbURL, dbLogin, dbPassword ) ) {
			//String strSql = "SELECT * FROM T_Users WHERE login='" + login + "' AND password='" + password + "'";
			String strSql = "SELECT * FROM T_Users WHERE login=? AND password=?";
			try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
				statement.setString( 1, login );
				statement.setString( 2, password );
				try ( ResultSet resultSet = statement.executeQuery() ) {
					if ( resultSet.next() ) {
						return new Users(
								resultSet.getInt( "IdUser" ),
								resultSet.getString("Login"),
								resultSet.getString( "Password" ),
								resultSet.getInt( "ConnectionNumber" )
						);
					} else {
						return null;
					}
				}
			}
		} catch ( SQLException e ) {
			throw new RuntimeException( e );
		}
	}
	
}