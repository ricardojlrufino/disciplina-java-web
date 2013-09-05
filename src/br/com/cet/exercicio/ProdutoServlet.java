package br.com.cet.exercicio;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.cet.exercicio.forms.CadastroProdutoForm;

@WebServlet("/produto")
public class ProdutoServlet extends CrudBaseServlet {
	private static final long serialVersionUID = 1L;
       
    public ProdutoServlet() {
        super();
    }
    
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
    	RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/Produto/cadastro.jsp");
    	dispatcher.forward(request, response);
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected String createForm(){
		CadastroProdutoForm form = new CadastroProdutoForm();
		return form.createForm();
	}
	
}
