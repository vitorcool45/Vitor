package VetoresEMatrizes;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
	
		final int linha=3, coluna=3;
		float numero[][] = new float [linha][coluna];
		
		int maior10=0;
		
		Scanner mostre = new Scanner(System.in);
		
		for(int l=0;l<linha;l++)
		{
			for( int c=0;c<coluna;c++)
			{
				System.out.println("'\nDigite um número:");
				numero[l][c] = mostre.nextFloat();
				
				if (numero[l][c]>10)
				{
					maior10++;
				}
				}
			}
			
		System.out.println("\nA quantidade de números maiores que dez são: "+ maior10);
		
		
	}

}
  