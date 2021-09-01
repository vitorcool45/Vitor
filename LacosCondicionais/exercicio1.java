package LacosCondicionais;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota1,nota2,nota3;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = leia.nextInt();
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = leia.nextInt();
		System.out.println("\nEntre com a terceira nota: ");
		nota3 = leia.nextInt();
		
		if (nota1 > nota2 && nota1 > nota3)
		{
			System.out.println("A maior nota é: "+nota1);
		}
		if (nota2 > nota1 && nota2 > nota3)
		{
			System.out.println("Valor: "+nota2);
		}
		if (nota3 > nota2 && nota3 > nota1)
		{
			System.out.println("Valor: "+nota3);
		}
			
		
		
		
		
		
	}

}
