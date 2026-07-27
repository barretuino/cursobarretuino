package pjAula12;

import java.util.LinkedList;
import java.util.List;

public class Curso {
	private String nome;
	
	//Limita o número de disciplinas
	public Disciplina disciplinas[] = new Disciplina[10];
	
	//Declaração de Lista que me dá elásticidade quanto a alocação
	public List<Disciplina> listDisciplinas = new LinkedList<Disciplina>();
}
