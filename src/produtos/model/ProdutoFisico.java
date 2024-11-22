package produtos.model;

public class ProdutoFisico extends Produtos {

    public ProdutoFisico(float valor, int estoque, int quantidade, String nome) {
        super(valor, estoque, quantidade, nome);
    }

    @Override
    public void desconto() {
        
        float valorComDesconto = getValor() - (getValor() * 0.05f);
        System.out.println("Produto: " + getNome());
        System.out.println("Valor original: " + getValor());
        System.out.println("Desconto aplicado: 5%");
        System.out.println("Valor com desconto: " + valorComDesconto);
    }
}
