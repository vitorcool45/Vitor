package Heranca;

public class Animal {
	
	private String nome;
	private String idade;
	private String som;
	private String acao;
	
	public Animal(String nome, String idade, String som, String acao)
	{
		super();
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		this.acao = acao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}
	
		

}
