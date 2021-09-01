package LacosCondicionais;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
	int n1,n2,n3;
	
	Scanner leia =  new Scanner (System.in);
	
	System.out.println("\nEntre com o primeiro peso: ");
	n1 = leia.nextInt();
	System.out.println("\nEntre com o segundo peso: ");
	n2 = leia.nextInt();
	System.out.println("\nEntre o terceiro peso: ");
	n3 = leia.nextInt();
	
		if ((n1>=n2) && (n2>=n3))
		{
			System.out.println("A ordem crescente fica: ");
		}

	

		if ((n2>=n1) && (n1>=n3))
		{
			
		}
	
		if ((n3>=n1) && (n2>=n1))
		{
			
		}
			
		
	}

}
