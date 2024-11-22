package ecommercer.repository;

import ecommercer.model.Produtos;
import java.util.List;

public interface ProdutoRepository {

   
    void adicionarProduto(Produtos produto);

  
    List<Produtos> listarProdutos();

  
    void atualizarProduto(String nome, Produtos produtoAtualizado);

   
    void excluirProduto(String nome);

   
    Produtos buscarProdutoPorNome(String nome);

}
