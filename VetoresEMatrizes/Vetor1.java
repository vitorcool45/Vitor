package VetoresEMatrizes;

import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
		
		int numero[] = new int[6];
		int par,impar,somapar=0,qimpar=0;
		
		Scanner mostre = new Scanner(System.in);
		
		for(int x=0;x<6;x++)
		{	
		System.out.println("\nEntre com seu n�mero: ");
		numero[x] = mostre.nextInt();
		}
		
		for (int x=0;x<6;x++)
		{
			if (numero[x] % 2 == 0)
			{
				System.out.println("\nOs n�meros pares s�o: "+numero[x]);
				somapar += numero[x];	
			}
			else
			{
				System.out.println("\nOs n�meros impares s�o: "+numero[x]);
				qimpar++;
			}
			
		}
			System.out.println("nA soma dos n�meros pares s�o:" +somapar);
			System.out.println("\nA quantidade de n�meros �mapares � de:" +qimpar);
			
			
			
	}

}
