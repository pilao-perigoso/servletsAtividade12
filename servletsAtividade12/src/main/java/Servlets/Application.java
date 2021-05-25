package main.java.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/atividade12")
public class Application extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		PrintWriter out = response.getWriter();
		String titulo = request.getParameter("titulo");
		String autor = request.getParameter("autor");
		String ano =  request.getParameter("ano");
		
		out.println("Título: " + titulo);
		out.println("Autor: " + autor);
		out.println("Ano de publicação: " + ano);
	}	
}
