package ecommercer;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {
			System.out.println("************************************************************************************");
			System.out.println("                                                                                    ");
			System.out.println("                                  Livraria Beco Diagonal                            ");
			System.out.println("************************************************************************************");
			System.out.println("                                                                                    ");
			System.out.println("                              1 - Comprar                                           ");
			System.out.println("                              2 - Consultar Produto                                 ");
			System.out.println("                              3 - Sair                                              ");
			System.out.println("                                                                                    ");
			System.out.println("************************************************************************************");
			System.out.println("Entre com a opção desejada:                                ");
			System.out.println("                                                           ");

			opcao = leia.nextInt();

			if (opcao == 3) {
				System.out.println("Beco Diagonal - A sua aventura começa aqui!");
				sobre();
				leia.close();
				System.exit(0);

			}
			
			switch (opcao) {
			
			case 1:
				System.out.println("Comprar");
				break;
				
			case 2:
				System.out.println("Concultar produto");
				break;
			
			default:
				System.out.println("\nOpção Inválida\n");
				break;
			}
			
			
			

		}
		
		
	}
	
	public static void sobre() {
		System.out.println("\n**************************************************************************************");
		System.out.println("                    Projeto Desenvolvido por: Dandara Medeiros Da Silva                 ");
		System.out.println("                    Generation Brasil - dandaraS@genenation.org                         ");
		System.out.println("                    https://github.com/DandaraaAfroo                                    ");
		System.out.println("****************************************************************************************");
	}

}
