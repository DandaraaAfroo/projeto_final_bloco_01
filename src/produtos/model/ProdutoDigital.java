package produtos.model;

public class ProdutoDigital extends Produtos {

	
	public ProdutoDigital(float valor, int estoque, int quantidade, float desconto, String nome) {
		super(valor, estoque, quantidade, nome);
		
	}

	@Override
	public void desconto() {
		float valorComDesconto = getValor() - (getValor() * 0.10f); 
        System.out.println("Produto: " + getNome());
        System.out.println("Valor original: " + getValor());
        System.out.println("Desconto aplicado: 10%");
        System.out.println("Valor com desconto: " + valorComDesconto);
    }
		
	}
	



