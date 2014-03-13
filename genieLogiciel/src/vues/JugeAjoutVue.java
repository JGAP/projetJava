package vues;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


public class JugeAjoutVue extends AMC_JugeVue implements ActionListener{

	public JugeAjoutVue(JFrame fenetre) {
		super(fenetre);
		setTitle("Ajouter Juge");
		precedentBouton.addActionListener(this);
		validerBouton.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
		Object source=e.getSource();
		if(source==validerBouton){
			//Ajout
			pagePrecedente.setVisible(true);
			dispose();
		}
		
	
	if(source==precedentBouton){
		this.pagePrecedente.setVisible(true);
		dispose();
	}
	
}
	
}
