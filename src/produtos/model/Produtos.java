package produtos.model;

public class Produtos {

	private float valor;
	private int estoque;
	private int quantidade;
	

	public Produtos(float valor, int estoque, int quantidade) {
		super();
		this.valor = valor;
		this.estoque = estoque;
		this.quantidade = quantidade;
	}


	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
}
