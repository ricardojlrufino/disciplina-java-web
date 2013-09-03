package br.com.cet.exercicio;

import java.io.IOException;

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

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected String createForm(){
		CadastroProdutoForm form = new CadastroProdutoForm();
		return form.createForm();
	}
	
}
