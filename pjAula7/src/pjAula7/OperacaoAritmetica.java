package pjAula7;

public class OperacaoAritmetica {
	
	//Quantidadade de Argumentos
	public double calcular(double x, double y, double z) {
		return x + y + z;
	}
	public double calcular(double x, double y) {
		return x + y;
	}
	
	//Variando o tipo
	public double calcular(int x, double y) {
		return x + y;
	}	
	public double calcular(String x, String y, double z) {
		return Double.parseDouble(x) + Double.parseDouble(y) + z;
	}
	
	//Ordem dos argumentos
	public double calcular(double x, int y) {
		return x + y;
	}
	public double calcular(String x, double y, String z) {
		return Double.parseDouble(x) + Double.parseDouble(z) + y;
	}
	
	public static void main(String[] args) {
		OperacaoAritmetica op = new OperacaoAritmetica();
		
		System.out.println(op.calcular(3.14, 11.3));
		System.out.println(op.calcular(5,  10.53));
		System.out.println(op.calcular(5, 10, 15));
		System.out.println(op.calcular("3.32", "1.45" , 12));
		System.out.println(op.calcular("1.45", 16, "3.11"));
	}
}
