package LacosRepeticao;

import java.util.Scanner;

public class FOR {

	public static void main(String[] args) {
		
		int n,contpar=0,contimpar=0,x;
		
		Scanner leia = new Scanner (System.in);
		
		for(x=1;x<=10;x++)
		{
			System.out.print("Entre com um n�mero: ");
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
		
		System.out.println("\nOs nu�meros pares s�o:"+contpar);
		System.out.println("\nOs npumeros �mpares s�o:"+contimpar);
	

	}

}

