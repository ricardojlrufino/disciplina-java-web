package br.com.cet.exercicio;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.cet.exercicio.forms.CadastroProdutoForm;
import br.com.cet.exercicio.util.ConnectionFactory;
import br.com.cet.exercicio.util.SetupDatabase;

@WebServlet("/produto")
public class ProdutoServlet extends CrudBaseServlet {
	private static final long serialVersionUID = 1L;
       
    public ProdutoServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String descricao = request.getParameter("descricao");
		String preco = request.getParameter("preco");
		
		// TODO: Precisa validar né cara ?!!
		
		Connection connection = new ConnectionFactory().getConnection();
		try {
			PreparedStatement insert = connection.prepareStatement("INSERT INTO Produto values (null, ?,?)");
			insert.setString(1, descricao);
			insert.setString(2, preco);
			insert.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected String createForm(){
		CadastroProdutoForm form = new CadastroProdutoForm();
		return form.createForm();
	}
	
}
