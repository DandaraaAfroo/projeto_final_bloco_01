package produtos.model;

public class ProdutoDigital extends Produtos {

	private float desconto;

	public ProdutoDigital(String tipo, float valor, int estoque, int quantidade, float desconto) {
		super(tipo, valor, estoque, quantidade);
		this.desconto = desconto;
	}

	public float getDesconto() {
		return desconto;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}

}