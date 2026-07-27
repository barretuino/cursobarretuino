package pjAula9;

public class Contas {
	public static double mostrarCalculo(OperacaoMatematica op, double x, double y) {
		System.out.println("O resultado é: " + op.calcular(x, y));
		return op.calcular(x, y);
	}
	
	public static void main(String[] args) {
		Contas.mostrarCalculo(new Soma(), 10, 5);
		Contas.mostrarCalculo(new Subtracao(), 10, 5);
		Contas.mostrarCalculo(new Multiplicacao(), 10, 5);
		Contas.mostrarCalculo(new Divisao(), 10, 5);
	}
}
