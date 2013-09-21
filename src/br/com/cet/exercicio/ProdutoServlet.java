package br.com.cet.exercicio;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.cet.exercicio.dao.ProdutoDao;
import br.com.cet.exercicio.forms.CadastroProdutoForm;
import br.com.cet.exercicio.modelo.Produto;

@WebServlet("/produto")
public class ProdutoServlet extends CrudBaseServlet {
	private static final long serialVersionUID = 1L;
       
    public ProdutoServlet() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String descricao = request.getParameter("descricao");
		String preco = request.getParameter("preco");
		String categoria = request.getParameter("categoria");
		
		Produto produto = new Produto();
		produto.setDescricao(descricao);
		produto.setPreco(preco);
		
		ProdutoDao dao = new ProdutoDao();
		dao.inserir(produto);
	
	}

	protected String createForm(){
		CadastroProdutoForm form = new CadastroProdutoForm();
		return form.createForm();
	}
	
}
