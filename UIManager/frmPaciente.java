package pjExperimental;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class frmPaciente extends JFrame{
	
	JButton btCadastrar;
	
	public frmPaciente() {
		try {
		    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            javax.swing.UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		    // Se o Nimbus não estiver disponível, ele manterá o padrão
		    e.printStackTrace();
		}
		
		setTitle("Cadastro de Paciente");
		setSize(600,800);
		setLayout(new FlowLayout());
		
		btCadastrar = new JButton("Cadastrar");
		
		add(btCadastrar);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		frmPaciente frm = new frmPaciente();
	}

}
