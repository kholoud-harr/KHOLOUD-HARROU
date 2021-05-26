package com.inscription.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inscription.dao.Etudiantdao;
import com.inscription.model.Etudiant;
import java.sql.SQLException;

/**
 * Servlet implementation class EtudiantServlet
 */
@WebServlet("/AjouterEtudiantservlet")
public class AjouterEtudiantservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
	public AjouterEtudiantservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
String Nom= request.getParameter("Nom");
		String Prenom= request.getParameter("Prenom");
		String Email= request.getParameter("Email");
		String Telephone= request.getParameter("Telephone");
		String password= request.getParameter("password");

		Etudiant etudiant =new Etudiant();
		etudiant.setNom(Nom);
		etudiant.setPrenom(Prenom);
		etudiant.setEmail(Email);
		etudiant.setTelephone(Telephone);
		etudiant.setPassword(password);
		Etudiantdao rdao= new  Etudiantdao();
		String result = rdao.AjouterEtudiant(etudiant);
		response.getWriter().print(result);
}

}
