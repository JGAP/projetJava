import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


public class TGIConsultVue extends AMC_TGIVue implements ActionListener{

	public TGIConsultVue(JFrame fenetre) {
		super(fenetre);
		setTitle("Consulter TGI");
		validerBouton.addActionListener(this);
		precedentBouton.addActionListener(this);
		nomText.setEditable(false);
		adresseText.setEditable(false);
		telText.setEditable(false);
		
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
