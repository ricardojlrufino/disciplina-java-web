package br.com.cet.exercicio;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public abstract class CrudBaseServlet  extends HttpServlet  {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sessao = request.getSession(true);  
		
		Boolean logado = (Boolean) sessao.getAttribute("logado");
		
		// Caso nao estaja logado... !!
		if(logado == null || logado == false){
			
			PrintWriter writer = response.getWriter();
			writer.print("<html>");
			writer.print("Voce N tem permissao para acessar isso aqui !!!!");
			writer.print("</html>");
			writer.close();	
			
		}else{
			PrintWriter writer = response.getWriter();
			writer.print("<html>");
			writer.print(createForm());
			writer.print("</html>");
			writer.close();		
		}	
	}

	protected abstract String createForm();
	
}
