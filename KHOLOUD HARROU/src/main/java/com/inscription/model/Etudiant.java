package com.inscription.model;

public class Etudiant {
private String Nom;
private String Prenom;
private String Telephone;
private String email;
private String password;

public String getTelephone() {
	return Telephone;
}
public void setTelephone(String telephone) {
	Telephone = telephone;
}
public Etudiant(String nom, String prenom, String telephone, String email, String password) {
	super();
	Nom = nom;
	Prenom = prenom;
	Telephone = telephone;
	this.email = email;
	this.password = password;
}
public Etudiant() {
	super();

}
public String getNom() {
	return Nom;
}
public void setNom(String nom) {
	Nom = nom;
}
public String getPrenom() {
	return Prenom;
}
public void setPrenom(String prenom) {
	Prenom = prenom;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


}
