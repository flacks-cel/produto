package entities;

public class ProdutoImportado extends Produto {
	
	private Double alfandega;

	public ProdutoImportado(String nome, Double preco, Double alfandega) {
		super(nome, preco);
		this.alfandega = alfandega;
	}

	public Double getAlfandega() {
		return alfandega;
	}

	public void setAlfandega(Double alfandega) {
		this.alfandega = alfandega;
	}
	
	public Double PrecoTotal() {
		return getPreco() + alfandega;
	}
	
	
	@Override
	public String etiqueta() {
		return getNome() 
				+ " $ " + String.format("%.2f", PrecoTotal()) 
				+ "(alfandega: $ " 
				+ String.format("%.2f", alfandega) 
				+ ")";
	}

}
