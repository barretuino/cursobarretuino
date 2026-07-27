package pjAula11;

public class Demonstracao {
	public static void main(String[] args) {
		ClasseStatic a = new ClasseStatic();
		ClasseStatic b = new ClasseStatic();
		ClasseStatic c = new ClasseStatic();
		
		System.out.println(ClasseStatic.contador);
		ClasseStatic.remover();
		System.out.println(ClasseStatic.contador);
		ClasseStatic.remover();
		System.out.println(ClasseStatic.contador);
		ClasseStatic.contador = 100;
		System.out.println(ClasseStatic.contador);
		System.out.println(Math.sqrt(0));
		
		System.out.println(b.cotacaoDolar);
		System.out.println(c.cotacaoDolar);
	}
}
