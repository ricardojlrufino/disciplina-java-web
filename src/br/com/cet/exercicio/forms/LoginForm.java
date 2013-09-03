package br.com.cet.exercicio.forms;

public class LoginForm {
	public String createForm(){
		String html = "<form action='login' method='post'>" +
				"usuario: <input name='usuario' /> <br/>" +
				"senha: <input name='senha' type='password' /> <br/>" +
				"<input type='submit' />" +
				"</form>";
		return html;
	}

}
