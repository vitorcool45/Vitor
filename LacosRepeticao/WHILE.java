package LacosRepeticao;

import java.util.Scanner;

public class WHILE {

	public static void main(String[] args) {
		
		int idade=0,contmais=0,contmenos=0;
		
		Scanner leia = new Scanner(System.in);
		
		while(idade>=0 && idade<=99)
		{
			System.out.println("Entre com sua idade:");
			idade = leia.nextInt();
			
			if (idade<21)
			{
				contmenos++;
			}
			if (idade>50)
			{
			contmais++;
			}
				
		}
		
		System.out.println("A quantidade de pessoas com menos 21 anos são:"+ contmenos);
		System.out.println("A quantidade de pessoas com mais 50 anos são:"+ contmais);
			

	}

}
