import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


public class TGIModifVue extends AMC_TGIVue implements ActionListener{

	public TGIModifVue(JFrame fenetre) {
		super(fenetre);
		setTitle("Modifier TGI");
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
