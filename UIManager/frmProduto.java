package pjExperimental;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.formdev.flatlaf.FlatLightLaf;
//ou import com.formdev.flatlaf.FlatDarkLaf; para tema escuro

public class frmProduto extends JFrame {
	//Passo 1. Declarar Objetos Visuais
	JButton btCadastrar, btAlterar, btRemover, btPesquisar;
	JLabel lbCodigo, lbDescricao, lbQuantidade, lbLocalizacao;
	JTextField txtCodigo, txtDescricao, txtQuantidade, txtLocalizacao;
	JPanel pnCampos, pnBotoes;
	
	public frmProduto() {
		setTitle("Cadastro de Produto");
		setSize(400, 150);
		
		//Passo 2. Instanciação (Construção)
		btCadastrar = new JButton("Cadastrar");
		btAlterar = new JButton("Alterar");
		btRemover = new JButton("Remover");
		btPesquisar = new JButton("Pesquisar");
		
		lbCodigo = new JLabel("Código");
		lbDescricao = new JLabel("Descrição");
		lbQuantidade = new JLabel("Quantidade");
		lbLocalizacao = new JLabel("Localizacao");
		
		txtCodigo = new JTextField(20);
		txtDescricao = new JTextField(20);
		txtQuantidade = new JTextField(20);
		txtLocalizacao= new JTextField(20);
		
		pnCampos = new JPanel(new FlowLayout());
		pnBotoes = new JPanel(new FlowLayout());
		
		//Passo 3. Adicionar os compontes em tela
		pnCampos.add(lbCodigo);
		pnCampos.add(txtCodigo);
		pnCampos.add(lbDescricao);
		pnCampos.add(txtDescricao);
		pnCampos.add(lbQuantidade);
		pnCampos.add(txtQuantidade);
		pnCampos.add(lbLocalizacao);
		pnCampos.add(txtLocalizacao);
		pnCampos.setLayout(new GridLayout(4,2));
		
		pnBotoes.add(btCadastrar);
		pnBotoes.add(btAlterar);
		pnBotoes.add(btRemover);
		pnBotoes.add(btPesquisar);
		pnBotoes.setLayout(new GridLayout(1,4, 10, 10));		
		
		add(pnCampos, BorderLayout.CENTER);
		add(pnBotoes, BorderLayout.SOUTH);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
	    try {
	        // Tente usar esta linha primeiro para testar se a biblioteca está carregada
	        com.formdev.flatlaf.FlatIntelliJLaf.setup();
	    } catch( Exception ex ) {
	        System.err.println( "Falha ao iniciar o FlatLaf" );
	    }

	    // Inicia sua tela
	    java.awt.EventQueue.invokeLater(() -> {
	        new frmProduto().setVisible(true);
	    });
	}
}
