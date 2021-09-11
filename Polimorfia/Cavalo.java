package Polimorfia;

public class Cavalo extends Animal {
	
	public Cavalo() {
		super("Tilapia", "16 anos");
		
	}
	@Override
	public void som(String som)
	{
		System.out.println("O som que o cavalo faz é bocotó");
	}
	@Override
	public void acao(String acao)
	{
		System.out.println("O cavalo esta comendo grama");
		
	}
}
