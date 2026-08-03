package pjaula15;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class frmCadastro extends JFrame implements ActionListener{
	//1. Declarar
	JLabel lbNome, lbEmail, lbObservacao;
	JTextField txtNome, txtEmail;
	JTextArea txaObservacao;
	JButton btCadastrar, btLimpar;
	JPanel pnCampos, pnBotoes;
	
	public frmCadastro() {
		setSize(300, 300);
		
		//Gerenciador Layout
		setLayout(new BorderLayout());
		
		//2. Construir
		lbNome = new JLabel("Nome");
		txtNome = new JTextField(20);
		lbEmail = new JLabel("Email");
		txtEmail = new JTextField(20);
		btCadastrar = new JButton("Cadastrar");
		btLimpar = new JButton("Limpar");
		lbObservacao = new JLabel("Observação");
		txaObservacao = new JTextArea(3, 20);
		pnCampos = new JPanel(new FlowLayout());
		pnBotoes = new JPanel(new GridLayout(1, 2));
		
		//3. Adiciona
		pnCampos.add(lbNome);
		pnCampos.add(txtNome);
		pnCampos.add(lbEmail);
		pnCampos.add(txtEmail);
		pnCampos.add(lbObservacao);
		pnCampos.add(txaObservacao);
		
		add(pnCampos, BorderLayout.CENTER);
		
		pnBotoes.add(btCadastrar);
		pnBotoes.add(btLimpar);
		
		//4. Delegar Ação (Adicionar ao Listener de ações)
		txtNome.addActionListener(this);
		btCadastrar.addActionListener(this);
		btLimpar.addActionListener(this);
		
		add(pnBotoes, BorderLayout.NORTH);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		frmCadastro frm = new frmCadastro();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource() == btCadastrar) {
			System.out.println("Cadastrar");
			Date agora = new Date(evento.getWhen());
			System.out.println(agora);
		}
		if(evento.getSource() == btLimpar) {
			txtNome.setText("");
			txtEmail.setText("");
			txaObservacao.setText("Digite algo aqui");
			btCadastrar.removeActionListener(this);
			
			txtNome.requestFocus();
		}
		if(evento.getSource() == txtNome) {
			txaObservacao.setText(txtEmail.getText() + " " + txtNome.getText());
			btCadastrar.addActionListener(this);
		}
	}

}
