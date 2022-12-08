package prova;

public class Produtos {
	private int codigoProduto;
	private String nomeProduto;
	private double precoProduto;
	private int quantidadeProduto;

	public Produtos() {
		this.codigoProduto = 0;
		this.nomeProduto = " ";
		this.precoProduto = 0;
		this.quantidadeProduto = 0;
	}

	public int getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public double getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}
	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}
	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}

	public String toString() {
		return "Produtos [codigoProduto=" + codigoProduto + ", nomeProduto=" + nomeProduto + ", precoProduto="
				+ precoProduto + ", quantidadeProduto=" + quantidadeProduto + "]";
	}

} // FIM DA CLASSE
