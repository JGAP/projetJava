import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


public class ProcureurModifVue extends AMC_ProcureurVue implements ActionListener{

	public ProcureurModifVue(JFrame fenetre) {
		super(fenetre);
		setTitle("Modifier Procureur");
		precedentBouton.addActionListener(this);
		validerBouton.addActionListener(this);
		
		//faire des setText dans les JTextField
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source=e.getSource();
		if(source==validerBouton){
			//Modif
			pagePrecedente.setVisible(true);
			dispose();
		}
		
		if(source==precedentBouton){
			this.pagePrecedente.setVisible(true);
			dispose();
		}
	}
	

}
