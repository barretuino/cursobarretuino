package pjAula11;

public class ClasseStatic {
	
	public static int contador = 0;
	public int id;
	public static double cotacaoDolar = 5.32;
	
	public static void acumular() {
		contador++;
	}
	
	public static void remover() {
		contador--;
	}
	
	public ClasseStatic() {
		acumular();
		this.id = contador;
	}
}
