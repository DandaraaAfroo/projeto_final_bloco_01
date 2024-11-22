package ecommercer;

import produtos.model.ProdutoDigital;
import produtos.model.ProdutoFisico;
import java.util.Scanner;
import ecommercer.util.Cores;

public class Menu {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int opcao;

        while (true) {
        	
        	System.out.println(Cores.TEXT_YELLOW_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND);
            System.out.println("************************************************************************************");
            System.out.println("                                  Livraria Beco Diagonal                            ");
            System.out.println("************************************************************************************");
            System.out.println("                              1 - Comprar                                           ");
            System.out.println("                              2 - Consultar Produto                                 ");
            System.out.println("                              3 - Testar Desconto Produto Digital                  ");
            System.out.println("                              4 - Testar Desconto Produto Físico                   ");
            System.out.println("                              5 - Sair                                              ");
            System.out.println("************************************************************************************");
            System.out.print("Entre com a opção desejada: ");

            opcao = leia.nextInt();

            if (opcao == 5) {
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
                    System.out.println("Consultar produto");
                    break;

                case 3:
                    testarProdutoDigital();
                    break;

                case 4:
                    testarProdutoFisico();
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

    public static void testarProdutoDigital() {
       
        ProdutoDigital ebook = new ProdutoDigital(50.0f, 100, 1, 0, "E-book de Java");
        System.out.println("\nTestando desconto no produto digital:");
        ebook.desconto();
    }

    public static void testarProdutoFisico() {
       
        ProdutoFisico livro = new ProdutoFisico(100.0f, 50, 2, "Livro de Programação");
        System.out.println("\nTestando desconto no produto físico:");
        livro.desconto();
    }
}
