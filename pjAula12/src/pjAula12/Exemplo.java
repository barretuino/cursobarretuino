package pjAula12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Exemplo {

	public static void main(String[] args) {
		Curso seuCurso = new Curso();
		
		//Utilizando um estrutura de dados do tipo array
		seuCurso.disciplinas[0] = new Disciplina();
		seuCurso.disciplinas[0].setCodigo(001);
		seuCurso.disciplinas[0].setDescricao("Linguagem de Programação");
		seuCurso.disciplinas[0].setCreditos(4);
		
		seuCurso.disciplinas[1] = new Disciplina();
		seuCurso.disciplinas[1].setCodigo(002);
		seuCurso.disciplinas[1].setDescricao("Gestão de Banco de Dados");
		seuCurso.disciplinas[1].setCreditos(6);
		//....
		
		/*for(int i=0; i<10; i++) {
			System.out.println(seuCurso.disciplinas[i].getDescricao());
		}*/
		
		//Utilizando uma estrutura de dados do tipo Collection
		Disciplina disciplina = new Disciplina();
		disciplina.setCodigo(001);
		disciplina.setDescricao("Linguagem de Programação");
		disciplina.setCreditos(4);
		
		seuCurso.listDisciplinas.add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setCodigo(002);
		disciplina2.setDescricao("Gestão de Banco de Dados");
		disciplina2.setCreditos(6);
		
		seuCurso.listDisciplinas.add(disciplina2);
		
		System.out.println(seuCurso.listDisciplinas.size());
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setCodigo(003);
		disciplina3.setDescricao("Sistemas Operacionais");
		disciplina3.setCreditos(2);
		
		seuCurso.listDisciplinas.add(disciplina3);
		System.out.println(seuCurso.listDisciplinas.size());
		
		seuCurso.listDisciplinas.forEach(i -> {
			System.out.println(i.getDescricao());
		});
		
		seuCurso.listDisciplinas.remove(1);
		seuCurso.listDisciplinas.forEach(i -> {
			System.out.println(i.getDescricao());
		});
		System.out.println(seuCurso.listDisciplinas.size());
		
		long inicio = System.currentTimeMillis();
		seuCurso.listDisciplinas.clear();
		System.out.println(seuCurso.listDisciplinas.size());
		
		for(int i=0; i<1_000_000; i++) {
			Disciplina d = new Disciplina();
			d.setCodigo(i);
			d.setDescricao("Disciplina " + i);
			d.setCreditos(i*10);
			
			seuCurso.listDisciplinas.add(d);
		}
		System.out.println(seuCurso.listDisciplinas.size());
		System.out.println("Tempo em ms " + (System.currentTimeMillis()- inicio));
		
		inicio = System.currentTimeMillis();
		/*seuCurso.listDisciplinas.forEach(i -> {
			System.out.println(i.getDescricao());
		});*/
		System.out.println("Tempo em ms " + (System.currentTimeMillis()- inicio)); //7124
		
		Set elementosUnicos = new TreeSet();
		seuCurso.listDisciplinas.forEach(i -> {
			if(i.getCodigo()%9 == 0)
				elementosUnicos.add(i.getCodigo());
		});
		
		System.out.println(elementosUnicos);
		
		Map<Integer, Disciplina> disciplinasDP = new HashMap<Integer, Disciplina>();
		
		disciplinasDP.put(2, disciplina2);
		disciplinasDP.put(3, disciplina3);
		disciplinasDP.put(1, disciplina);
		
		System.out.println(disciplinasDP.get(2).getDescricao());
		
		System.out.println(disciplinasDP);
	}

}
