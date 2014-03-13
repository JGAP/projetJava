package vues;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


public class JugeConsultVue extends AMC_JugeVue implements ActionListener{

	public JugeConsultVue(JFrame fenetre) {
		super(fenetre);
		setTitle("Consulter Juge");
		validerBouton.addActionListener(this);
		precedentBouton.addActionListener(this);
		nomText.setEditable(false);
		prenomText.setEditable(false);
		titreText.setEditable(false);
		
		//faire des setText dans les JTextField
		
	}


	public void actionPerformed(ActionEvent e) {
		Object source=e.getSource();
		if(source==validerBouton){
			//Consult
			pagePrecedente.setVisible(true);
			dispose();
		}
		if(source==precedentBouton){
			this.pagePrecedente.setVisible(true);
			dispose();
		}
	}

}
