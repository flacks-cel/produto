package entities;

import java.util.Date;

public class ProdutoUsado extends Produto {
	
	private Date data;

	public ProdutoUsado(String nome, Double preco, Date fabricado) {
		super(nome, preco);
		this.data = data;
	}

	public Date getdata() {
		return data;
	}

	public void setdata(Date data) {
		this.data = data;
	}
	
	
	@Override
	public String etiqueta() {
		return getNome() 
				+ " (usado) $ " 
				+ String.format("%.2f", getPreco()) 
				+ " (fabricado : " 
				+ ")";
	}
}
