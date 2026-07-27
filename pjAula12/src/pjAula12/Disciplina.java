package pjAula12;

public class Disciplina {
	private int codigo;
	private String descricao;
	private int creditos;
	private String sala;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	public String getSala() {
		return sala;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}
	
	@Override
	public String toString() {
		return "Código: " + codigo + " Descrição: " 
				+ descricao + " Crédito: " + creditos;
	}
}
