package br.org.generation.lojadegames.model;

public class UserLogin {
	
private long Id;
	
	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	private String nome;
	
	private String usuario;
	
	private String senha;
	
	private String token;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
