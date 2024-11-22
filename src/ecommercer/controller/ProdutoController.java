package ecommercer.controller;

import ecommercer.model.ProdutoFisico;
import ecommercer.model.ProdutoDigital;
import ecommercer.model.Produtos;
import java.util.ArrayList;
import java.util.List;

public class ProdutoController {

    private List<Produtos> produtosList;

   
    public ProdutoController() {
       
        produtosList = new ArrayList<>();
    }


    public void adicionarProduto(Produtos produto) {
        try {
            if (produto != null) {
                produtosList.add(produto);
                System.out.println("Produto adicionado com sucesso!");
            } else {
                throw new IllegalArgumentException("Produto não pode ser nulo.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao adicionar produto: " + e.getMessage());
        }
    }

    
    public void listarProdutos() {
        try {
            if (produtosList.isEmpty()) {
                throw new Exception("Não há produtos cadastrados.");
            }
            for (Produtos produto : produtosList) {
                System.out.println("Produto: " + produto.getNome());
                System.out.println("Valor: " + produto.getValor());
                produto.desconto();
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar produtos: " + e.getMessage());
        }
    }

    // Método para atualizar um produto
    public void atualizarProduto(String nome, Produtos novoProduto) {
        try {
            boolean produtoEncontrado = false;
            for (int i = 0; i < produtosList.size(); i++) {
                if (produtosList.get(i).getNome().equalsIgnoreCase(nome)) {
                    produtosList.set(i, novoProduto);
                    produtoEncontrado = true;
                    System.out.println("Produto atualizado com sucesso!");
                    break;
                }
            }
            if (!produtoEncontrado) {
                throw new Exception("Produto não encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao atualizar produto: " + e.getMessage());
        }
    }

 
    public void excluirProduto(String nome) {
        try {
            boolean produtoEncontrado = false;
            for (int i = 0; i < produtosList.size(); i++) {
                if (produtosList.get(i).getNome().equalsIgnoreCase(nome)) {
                    produtosList.remove(i);
                    produtoEncontrado = true;
                    System.out.println("Produto excluído com sucesso!");
                    break;
                }
            }
            if (!produtoEncontrado) {
                throw new Exception("Produto não encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao excluir produto: " + e.getMessage());
        }
    }

}
