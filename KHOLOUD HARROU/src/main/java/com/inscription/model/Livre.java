package com.inscription.model;

public class Livre {
	private String Nom;
	private String Categorie;
	private String Auteur;
	
	public Livre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Livre(String nom, String categorie, String auteur) {
		super();
		Nom = nom;
		Categorie = categorie;
		Auteur = auteur;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getCategorie() {
		return Categorie;
	}
	public void setCategorie(String categorie) {
		Categorie = categorie;
	}
	public String getAuteur() {
		return Auteur;
	}
	public void setAuteur(String auteur) {
		Auteur = auteur;
	}

}
