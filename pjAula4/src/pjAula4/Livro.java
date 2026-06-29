package pjAula4;

/**
 * Modela Conceitualmente um Livro
 */
public class Livro {
	//Atributos - Caracteristicas
	int codigo;
	String titulo;
	String autor;
	float valor;
	//TODO: outras caracteristicas
		
	//Métodos - Ações/Capacidades de execução
	//Método construtor
	//1.Tem exatamento o mesmo da classe
	//2.Ele é public
	//3.Não possuí retorno descrito, pois implicitamente seu retorno é o novo objeto
	public Livro(int codigo) {
		this.codigo = codigo;
		this.valor = 100;
	}
	
	public void exemplo(int valor) {
		System.out.println(valor);
		System.out.println(this.valor);
	}
	
}
