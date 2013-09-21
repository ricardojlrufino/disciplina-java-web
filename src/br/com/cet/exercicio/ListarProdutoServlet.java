package br.com.cet.exercicio;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.cet.exercicio.modelo.Produto;
import br.com.cet.exercicio.util.ConnectionFactory;

@WebServlet("/listar-produto")
public class ListarProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListarProdutoServlet() {
        super();
    }

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Connection connection = new ConnectionFactory().getConnection();
		
		try {
			ResultSet resultSet = connection.createStatement().executeQuery("select * from Produto s");
			List<Produto> lista = new ArrayList<Produto>();
			
			while(resultSet.next()){
				long id = resultSet.getLong("id");
				String descricao = resultSet.getString("descricao");
				String preco = resultSet.getString("preco");
				Produto produto = new Produto(id, descricao, preco);
				lista.add(produto);
			}
			
			req.setAttribute("lista", lista);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
		
		
		
	
		req.getRequestDispatcher("jsp/produto/listar.jsp").forward(req, resp);
	}
	
}
