package com.inscription.dao;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.inscription.model.Livre;
public class Livredao {

	private String dburl="jdbc:mysql://localhost:3306/gestion?serverTimezone=UTC";
	private String dbUname="root";
	private String dbPassword ="kholouD@99";
	private String dbDriver = "com.mysql.jdbc.Driver";
	public void loadDriver(String dbDriver) {
		try {
			Class.forName(dbDriver);
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
	}
		public Connection getConnection()
		{
			Connection con =null;
			try {
				con= DriverManager.getConnection(dburl, dbUname, dbPassword);			
		}catch(SQLException e) {
			e.printStackTrace();
		}
			return con;
		}
		
	public String AjouterLivre(Livre livre) {
	String INSERT_USERS_SQL ="INSERT INTO livre VALUES(?,?,?)";
String result ="Data entered successfully";;
try {
	Class.forName("com.mysql.jdbc.Driver");

}catch(ClassNotFoundException e){
	e.printStackTrace();
	}
try (Connection connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/gestion?serverTimezone=UTC", "root", "kholouD@99");
	PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)){

	preparedStatement.setString(1, livre.getNom());
	preparedStatement.setString(2, livre.getCategorie());
	preparedStatement.setString(3, livre.getAuteur());
	
 System.out.println(preparedStatement);
 preparedStatement.executeUpdate();
 }catch(SQLException e1) {
	 e1.printStackTrace();
	 result="data not entered";
	 
	
}
return result;}
}
