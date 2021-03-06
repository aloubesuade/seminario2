package negocio;


import utils.HashUtil;

public class Usuario {

	private String apodo;
	private String email;
	private String password;

	public Usuario(String apodo, String email, String password) {
		this.apodo = apodo;
		this.email = email;
		this.password = password;

	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean passwordCorrecta(String password) {
		return (this.password.equals(HashUtil.hashString(password)));
	}



}
