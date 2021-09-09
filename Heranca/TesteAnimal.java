package Heranca;

public class TesteAnimal {

	public static void main(String[] args) {
		Cachorro animal1 = new Cachorro("Bolota", "7", "Latido auau", "Correndo", "Indigo");
		animal1.imprimirInf();
		
		Cavalo animal2 = new Cavalo("Mym", "5", "Relinchar", "Brincando com o cachorro", "Dourada");
		animal2.imprimirnf();
		
		Preguica animal3 = new Preguica("Lola", "6", "Ronco", "Dormindo", "Verdes");
		animal3.imprimirnf();

	}

}
