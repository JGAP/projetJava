import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


public class GreffierModifVue extends AMC_GreffierVue implements ActionListener{

	public GreffierModifVue(JFrame fenetre) {
		super(fenetre);
		setTitle("Modifier Greffier");
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
