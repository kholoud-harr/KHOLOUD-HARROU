package com.inscription.model;

public class Authentif {
private String Email;
@Override
public String toString() {
	return "Authentif [Email=" + Email + ", Password=" + Password + "]";
}
public Authentif(String email, String password) {
	super();
	Email = email;
	Password = password;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
private String Password;

}
