package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExerCollections {

	public static void main(String[] args) {
		
		int op=0;
		String produto, verifica, novo;
		Scanner leia = new Scanner(System.in);
		ArrayList <String> item = new ArrayList();
		

		do{
			System.out.println("\n\t\tItens no estojo");
			System.out.println("\n(1) Deseja adicionar algum item ao estojo?");
			System.out.println("\n(2) Deseja exckuir algum item do estojo?");
			System.out.println("\n(3) Atualizar item do estojo.");
			System.out.println("\n(4) Apresentar todos os itens do estojo.");
			System.out.println("\n(0) Encerre o programa.");
			System.out.println("\n Digite uma opção!");
			op = leia.nextInt();
			
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nDigite seu item para adicionar ao estojo.");
				produto = leia.nextLine();
				item.add(produto);
				break;
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o item para ser removido.");
				produto = leia.nextLine();
				if(item.contains(produto))
				{
					item.remove(produto);
				}
				else
				{
					System.out.println("\nItem não existe.");
				}
				break;
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o intem para ser atualizado.");
				verifica = leia.nextLine();
				System.out.println("\nDigite o novo produto");
				novo = leia.nextLine();
				
				if(item.contains(verifica))
				{
					item.remove(verifica);
					item.add(novo);
				}
				else
				{
					System.out.println("\nItem não existe");
				}
				System.out.println(item);
				break;
			case 4:
				System.out.println("\nOs itens no estojo são: ");
				System.out.println(item);
				break;
				
				default:
					System.out.println("\nOpção inválida");
			}
		}while(op!=0);
	}

	
	
	
	}