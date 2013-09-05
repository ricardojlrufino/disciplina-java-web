package br.com.cet.exercicio.auth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.cet.exercicio.forms.LoginForm;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.print("<html>");
		writer.print(createForm());
		writer.print("</html>");
		writer.close();		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		
		if(usuario.equals("admin") && senha.equals("admin")){
			
			HttpSession sessao = request.getSession(true);  
			
			sessao.setAttribute("logado", true);
			
			System.out.println("Usuario logado !");
			
		}else{
			
			System.out.println("Usuario , senha errada !!");
			
		}
		
	}
	
	private String createForm(){
		LoginForm form = new LoginForm();
		return form.createForm();
	}
	

}
