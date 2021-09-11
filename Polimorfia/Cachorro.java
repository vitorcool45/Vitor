package Polimorfia;

public class Cachorro extends Animal {
	
	public Cachorro() {
		super("Theodor", "8 anos");
		
	}
	@Override
	public void som(String som)
	{
		System.out.println("O som que o cachorro faz é Auau");
	}
	@Override
	public void acao(String acao)
	{
		System.out.println("O cachorro esta cuidando dos filhotes");
		
	}
}
