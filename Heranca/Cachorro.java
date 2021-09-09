package Heranca;

public class Cachorro extends Animal {
	
	private String cor;
	
	public Cachorro(String nome, String idade, String som, String acao, String cor)
	{
		super(nome, idade, som, acao);
		this.cor = cor;
		
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void imprimirInf()
	{
		System.out.println("\nO nome do cachorro é: "+getNome()+"\nIdade: "
				+getIdade()+"\nSom:  "+getSom()+"\nAcao: "+getAcao()+" \nA cor do seu pelo é: "+cor);
	}

}

