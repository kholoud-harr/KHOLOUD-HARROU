package com.inscription.dao;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.inscription.model.Etudiant;

public class Etudiantdao {
	private String dburl="jdbc:mysql://localhost:3306/gestion";
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
		
		public boolean voir(String email, String password) {
			loadDriver(dbDriver);
			Connection con =getConnection();
			boolean status = false;
			String sql= "select * from etudiant where email=? and password=?";
			PreparedStatement ps;
			try {
				ps=con.prepareStatement(sql);
				ps.setString(1, email);
				ps.setString(2, password);
				ResultSet rs=ps.executeQuery();
				status = rs.next();
								
			}catch(SQLException e ){
				e.printStackTrace();
				}
			return status;
			
		}
	public String AjouterEtudiant(Etudiant etudiant) {
	String INSERT_USERS_SQL ="INSERT INTO etudiant VALUES(?,?,?,?,?)";
	
String result ="Data entered successfully";;
try {
	Class.forName("com.mysql.jdbc.Driver");

}catch(ClassNotFoundException e){
	e.printStackTrace();
	}
try (
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion", "root", "kholouD@99");
	PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)){
System.out.println(connection);
	preparedStatement.setString(1, etudiant.getNom());
	preparedStatement.setString(2, etudiant.getPrenom());
	preparedStatement.setString(3, etudiant.getEmail());
	preparedStatement.setString(4, etudiant.getTelephone());
	preparedStatement.setString(5, etudiant.getPassword());
	System.out.println(preparedStatement);
	preparedStatement.executeUpdate();
 }catch(SQLException e1) {
	 e1.printStackTrace();
	 result="data not entered";	
}
return result;}
}
