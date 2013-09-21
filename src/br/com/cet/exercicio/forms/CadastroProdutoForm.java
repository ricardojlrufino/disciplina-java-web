package br.com.cet.exercicio.forms;

public class CadastroProdutoForm {
	
	public String createForm(){
		String html = "<form method='post'>" +
				"Descricao: <input name='descricao' /> <br/>" +
				"Preco: <input name='preco' /> <br/>" +
				"<input type='submit' />" +
				"</form>";
		return html;
	}

}
