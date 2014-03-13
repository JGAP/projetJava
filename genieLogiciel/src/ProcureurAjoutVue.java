import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


public class ProcureurAjoutVue extends AMC_ProcureurVue implements ActionListener{

	public ProcureurAjoutVue(JFrame fenetre) {
		super(fenetre);
		setTitle("Ajouter Procureur");
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
