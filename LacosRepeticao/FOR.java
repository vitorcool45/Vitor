package LacosRepeticao;

import java.util.Scanner;

public class FOR {

	public static void main(String[] args) {
		
		int n,contpar=0,contimpar=0,x;
		
		Scanner leia = new Scanner (System.in);
		
		for(x=1;x<=10;x++)
		{
			System.out.print("Entre com um número: ");
			n = leia.nextInt();
			if(x % 2 == 0)
			{
				contpar++;				
			}
			else
			{
				contimpar++;
			}
		}
		
		System.out.println("\nOs nuúmeros pares são:"+contpar);
		System.out.println("\nOs npumeros ímpares são:"+contimpar);
	

	}

}

