import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


public class TGIAjoutVue extends AMC_TGIVue implements ActionListener{

	public TGIAjoutVue(JFrame fenetre) {
		super(fenetre);
		setTitle("Ajouter TGI");
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
