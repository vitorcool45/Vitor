package Heranca;

public class Cavalo extends Animal {

	private String ferradura;
	
	public Cavalo(String nome, String idade, String som, String acao, String ferradura)
	{
		super(nome, idade, som, acao);
		this.ferradura = ferradura;
	}

	
	public String getFerradura() {
		return ferradura;
	}


	public void setFerradura(String ferradura) {
		this.ferradura = ferradura;
	}


	public void imprimirnf()
	{
		System.out.println("\nO nome do cavalo �: "+getNome()+"\nIdade: "
				+getIdade()+"\nSom:  "+getSom()+"\nAcao: "+getAcao()+" \nA sua ferradura � de: "+ferradura);
	}
}
