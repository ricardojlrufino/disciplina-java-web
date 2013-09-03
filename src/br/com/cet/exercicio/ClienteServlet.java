package br.com.cet.exercicio;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.cet.exercicio.forms.CadastroClienteForm;


/**
 * Servlet implementation class AulaDois
 */
@WebServlet("/cliente")
public class ClienteServlet extends CrudBaseServlet {
	
	private static final long serialVersionUID = 1L;
       
    public ClienteServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Executou .....");
		
		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
				
		PrintWriter writer = response.getWriter();
		writer.print("<html>");

		writer.print(createForm());
		
		writer.print("Endereco = " + endereco);
		writer.print("Nome" + nome);
		
		writer.print("</html>");
		writer.close();
		
		System.out.println("nome = " + nome);
		System.out.println("endereco = " + endereco);
		
		
	}
	
	protected String createForm(){
		CadastroClienteForm clienteForm = new CadastroClienteForm();
		return clienteForm.createForm();
	}
	

}
