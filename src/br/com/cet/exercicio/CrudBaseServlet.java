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
			
			System.out.println("Usuário tentando acessar página protegida: " + request.getRequestURI());
			
			PrintWriter writer = response.getWriter();
			writer.print("<html>");
			writer.print("Efetue o <a href=\"login\">Login</a> para ter acesso !!!!");
			writer.print("</html>");
			writer.close();	
			
			sessao.setAttribute(Constantes.BEFORE_LOGIN_URL, request.getRequestURI());
			
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
