package com.inscription.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inscription.dao.Livredao;
import com.inscription.model.Livre;

/**
 * Servlet implementation class Livreservlet
 */
@WebServlet("/AjouterLivreservlet")
public class AjouterLivreservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterLivreservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("start");
		String Nom= request.getParameter("Nom");
		String categorie= request.getParameter("Categorie");
		String Auteur= request.getParameter("Auteur");
		Livre livre =new Livre();
		livre.setNom(Nom);
        livre.setCategorie(categorie);
        livre.setAuteur(Auteur);

Livredao ldao= new  Livredao();
String result = ldao.AjouterLivre(livre);
response.getWriter().print(result);
}

}
