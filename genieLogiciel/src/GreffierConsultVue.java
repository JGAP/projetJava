import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


public class GreffierConsultVue extends AMC_GreffierVue implements ActionListener{

	public GreffierConsultVue(JFrame fenetre) {
		super(fenetre);
		setTitle("Consulter Greffier");
		validerBouton.addActionListener(this);
		precedentBouton.addActionListener(this);
		nomText.setEditable(false);
		adresseText.setEditable(false);
		titreText.setEditable(false);
		telText.setEditable(false);
		mobileText.setEditable(false);
		faxText.setEditable(false);
		
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
