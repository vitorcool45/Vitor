package Polimorfia;

public class Preguica extends Animal {
	
	public Preguica(){
		super("Brutus", "32 anos");
	}
	@Override
	public void som(String som)
	{
		System.out.println(" A preguica esta fazendo ZZZzZzzzZzZ");
	}
	@Override
	public void acao(String acao)
	{
		System.out.println("Por que ela esta ormiindo");
	}
}
