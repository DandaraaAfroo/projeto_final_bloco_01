package ecommercer.model;

public abstract class Produtos {

	private float valor;
	private int estoque;
	private int quantidade;
	private String nome;

	public Produtos(float valor, int estoque, int quantidade, String nome) {
		this.valor = valor;
		this.estoque = estoque;
		this.quantidade = quantidade;
		this.nome = nome;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract void desconto();
}
