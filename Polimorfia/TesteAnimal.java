package Polimorfia;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		System.out.println("\nNome: "+cachorro.getNome()+ "\nIdade: "+cachorro.getIdade());
		cachorro.som("som"); cachorro.acao("acao");
		
		System.out.println("\n\n");
		
		System.out.println("\nNome: "+cavalo.getNome()+ "\nIdade: "+cavalo.getIdade());
		cavalo.som("som"); cavalo.acao("acao");
		
		System.out.println("\n\n");
		
		System.out.println("\nNome: "+preguica.getNome()+ "\nIdade: "+preguica.getIdade());
		preguica.som("som"); preguica.acao("acao");
						
	}
}
