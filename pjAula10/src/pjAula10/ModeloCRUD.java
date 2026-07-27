package pjAula10;

public interface ModeloCRUD {
	public void inserir(Object obj);
	public void alterar(Object obj);
	public Object pesquisar(int id);
	public void remover(int id);
}
