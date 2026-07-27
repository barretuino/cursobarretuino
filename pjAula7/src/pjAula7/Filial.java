package pjAula7;

public class Filial extends Matriz {
	private double retencaoPersonalizado;
	
	public Filial(int codigo, String nome, double retencaoPersonalizado) {
		super(codigo, nome);
		this.retencaoPersonalizado = retencaoPersonalizado;
	}
	
	@Override
	public double calcular(double valorPago, double valorImposto, double retencao) {
		/*double valorRetorno = 0;
		if(retencaoPersonalizado > 0) {
			valorRetorno = super.calcular(valorPago, valorImposto, retencaoPersonalizado);
		}else {
			valorRetorno = super.calcular(valorPago, valorImposto, retencao);
		}
		return valorRetorno;*/
		return super.calcular(valorPago, valorImposto, (retencaoPersonalizado > 0
				? retencaoPersonalizado : retencao));
	}
	
}
