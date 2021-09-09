package Heranca;

public class Preguica extends Animal {
	
	private String olhos;
	
	public Preguica(String nome, String idade, String som, String acao, String olhos)
	{
		super(nome, idade, som, acao);
		this.olhos = olhos;
	}

	public String getOlhos() {
		return olhos;
	}

	public void setOlhos(String olhos) {
		this.olhos = olhos;
	}
	
	public void imprimirnf()
	{
		System.out.println("\nO nome da preguiçao é: "+getNome()+"\nIdade: "
				+getIdade()+"\nSom:  "+getSom()+"\nAcao: "+getAcao()+" \nSeus olhos são: "+olhos);
		
	}
	
	
	

}
