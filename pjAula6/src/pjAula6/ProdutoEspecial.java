package pjAula6;

public class ProdutoEspecial extends Produto {
	private String fabricante;

	public ProdutoEspecial(int codigo, String descricao, float valor) {
		super(codigo, descricao, valor);
	}
	
	public ProdutoEspecial(int codigo, String descricao, float valor, String fabricante) {
		this(codigo, descricao, valor);
		this.setFabricante(fabricante);
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

}
