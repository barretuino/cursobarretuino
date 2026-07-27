package pjAula9;

/** Em uma classe abstrata não há necessidade de especificar corpo
 * para métodos marcados com a palavra reservada abstract
 */
public abstract class Entidade {
	private int id;
	
	//Métodos Abstratos - O corpo (a ação) será definido pela classe herdeira
	public abstract void inserir(Object obj);
	public abstract void alterar(Object obj);
	public abstract Object pesquisar(int id);
	public abstract void excluir(int id);
	
	public String imprimir() {
		return "O Id da entidade é: " + getId();
	}	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
