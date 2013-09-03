package br.com.cet.exercicio.forms;

public class CadastroClienteForm {
	
	public String createForm(){
		String html = "<form action='aula' method='post'>" +
				"Nome: <input name='nome' /> <br/>" +
				"Endereco: <input name='endereco' /> <br/>" +
				"<input type='submit' />" +
				"</form>";
		return html;
	}

}
