package LacosCondicionais;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite sua idade: ");
		idade = leia.nextInt();
		
		if(idade >=10 && idade<= 14)
		{
			System.out.println("\nVoc� est� na categoria infantil:");
		}
		
		if(idade >=15 && idade<=17)
		{
			System.out.println("\nVoc� esta na categoria juvenil:");
		}
			
		if(idade >=18 && idade<=25)
		{
			System.out.println("\nVoc� esta na categoria adulto: ");
		}
		
		else
		{
			System.out.println("\n Voc� n�o esta apto para nenhuma categoria =/");
		}
		
		
		

	}

}
