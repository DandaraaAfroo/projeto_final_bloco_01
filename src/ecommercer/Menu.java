package ecommercer;

import java.util.Scanner;
import ecommercer.model.ProdutoDigital;
import ecommercer.model.ProdutoFisico;
import ecommercer.controller.ProdutoController;
import ecommercer.util.Cores;

public class Menu {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ProdutoController controller = new ProdutoController();

        int opcao;

        while (true) {
        	
            System.out.println(Cores.TEXT_YELLOW_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND);
            System.out.println("************************************************************************************");
            System.out.println("                                  Livraria Beco Diagonal                            ");
            System.out.println("************************************************************************************");
            System.out.println("                              1 - Adicionar novo Produto                            ");
            System.out.println("                              2 - Consultar Produto                                 ");
            System.out.println("                              3 - Atualizar um Produto                              ");
            System.out.println("                              4 - Excluir um Produto                                ");
            System.out.println("                              5 - Verificar Desconto Produto Digital                ");
            System.out.println("                              6 - Verificar Desconto Produto Físico                 ");
            System.out.println("                              7 - Sair                                              ");
            System.out.println("************************************************************************************");
            System.out.print("Entre com a opção desejada: ");

            opcao = leia.nextInt();
            leia.nextLine(); 

            if (opcao == 7) {
                System.out.println("Beco Diagonal - A sua aventura começa aqui!");
                sobre();
                leia.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    
                    System.out.println("Digite o nome do produto: ");
                    String nomeProduto = leia.nextLine();
                    System.out.println("Digite o valor do produto: ");
                    float valorProduto = leia.nextFloat();
                    System.out.println("Digite o estoque do produto: ");
                    int estoqueProduto = leia.nextInt();
                    leia.nextLine();  // Limpar o buffer

                    
                    System.out.println("O produto é físico ou digital? (Digite 'fisico' ou 'digital')");
                    String tipoProduto = leia.nextLine().toLowerCase();

                    if (tipoProduto.equals("fisico")) {
                        ProdutoFisico produtoFisico = new ProdutoFisico(valorProduto, estoqueProduto, 0, nomeProduto);
                        controller.adicionarProduto(produtoFisico);
                    } else if (tipoProduto.equals("digital")) {
                        ProdutoDigital produtoDigital = new ProdutoDigital(valorProduto, estoqueProduto, 0, 0, nomeProduto);
                        controller.adicionarProduto(produtoDigital);
                    } else {
                        System.out.println("Tipo de produto inválido. Escolha entre 'fisico' ou 'digital'.");
                    }
                    break;

                case 2:
                    
                    controller.listarProdutos();
                    break;

                case 3:
                    
                    System.out.println("Digite o nome do produto a ser atualizado: ");
                    String nomeAtualizar = leia.nextLine();
                    System.out.println("Digite o novo valor do produto: ");
                    float novoValor = leia.nextFloat();
                    System.out.println("Digite o novo estoque do produto: ");
                    int novoEstoque = leia.nextInt();
                    leia.nextLine(); 

                    ProdutoFisico produtoAtualizado = new ProdutoFisico(novoValor, novoEstoque, 0, nomeAtualizar);
                    controller.atualizarProduto(nomeAtualizar, produtoAtualizado);
                    break;

                case 4:
                    
                    System.out.println("Digite o nome do produto a ser excluído: ");
                    String nomeExcluir = leia.nextLine();
                    controller.excluirProduto(nomeExcluir);
                    break;

                case 5:
                    
                    System.out.println("\nTestando desconto no produto digital:");
                    ProdutoDigital ebookDigital = new ProdutoDigital(50.0f, 100, 0, 0, "E-book de Java");
                    ebookDigital.desconto();
                    break;

                case 6:
                    
                    System.out.println("\nTestando desconto no produto físico:");
                    ProdutoFisico livroFisico = new ProdutoFisico(100.0f, 50, 0, "Livro de Programação");
                    livroFisico.desconto();
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
