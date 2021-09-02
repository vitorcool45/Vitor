package LacosRepeticao;

import java.util.Scanner;

public class DOWHILE {

	public static void main(String[] args) {
		
		int num=0,somanum=0;
		
		Scanner leia = new Scanner(System.in);
		
		do 
		{
			somanum += num;
			
		System.out.println("\nEntre com um número:");
		num = leia.nextInt();
		}
		
		
			while(num !=0);
			System.out.println("\nA soma dos números é de:" + somanum);
			
		
		

	}

}
