package pjaula15;

import javax.swing.JOptionPane;

public class ExemploJOptionPane {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Este é um diálogo simples",
				"Curso Barretuino", JOptionPane.QUESTION_MESSAGE);
		
		String nome = JOptionPane.showInputDialog("Informe seu nome");
		JOptionPane.showConfirmDialog(null, "Seu nome é " + nome, "Curso Barretuino",
				JOptionPane.INFORMATION_MESSAGE);
		
		String salario = JOptionPane.showInputDialog(null, "Informe o salario",
			"Curso Barretuino", JOptionPane.QUESTION_MESSAGE);
		try {
			double salarioConv = Double.parseDouble(salario);
			JOptionPane.showMessageDialog(null, "Você recebeu promoção de 10%. " +
					"Seu novo salário é " + (salarioConv * 1.10),
					"Curso Barretuino", JOptionPane.QUESTION_MESSAGE);
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Houve um erro ao receber salario "
					+ e.getMessage(),
					"Curso Barretuino - Erro", JOptionPane.ERROR_MESSAGE);
		}
	}
}
