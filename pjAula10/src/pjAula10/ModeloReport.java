package pjAula10;

public interface ModeloReport {
	void definirTitulo(String titulo);
	void definirColunas(String...colunas);
	void definirConteudo(Object...valores);
	void definirRodape(String rodape);
	Object gerarRelatorio();
}
