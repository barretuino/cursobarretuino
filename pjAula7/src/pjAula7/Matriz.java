package pjAula7;

public class Matriz {
	//Atributos
	private int codigo;
	private String nome;
	
	//Método Construtor
	public Matriz(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}
	
	//Métodos
	public double calcular(double valorPago, double valorImposto, double retencao) {
		return (valorPago + valorImposto) / retencao;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
}
