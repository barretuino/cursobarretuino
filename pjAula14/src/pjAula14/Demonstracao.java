package pjAula14;

import java.io.File;

public class Demonstracao {
	public static void main(String[] args) {
		String diretorioRaiz = "C:\\Barretuino\\Cursos 2026\\Java Básico\\Apresentações"; 
		File arquivo = new File(diretorioRaiz);
		File apresentacao = new File("Aula 14 - Manipulação de Arquivos.ppt");
		File diretorioTeste = new File(diretorioRaiz + "\\" + "Teste\\TesteAula");
		
		System.out.println(arquivo.isDirectory() ? "Diretorio" : "Arquivo");
		System.out.println(apresentacao.isDirectory() ? "Diretorio" : "Arquivo");
		System.out.println(apresentacao.canRead());
		
	}
}