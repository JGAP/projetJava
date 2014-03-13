package vues;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import métier.Tgi;


public class TGIConsultVue extends AMC_TGIVue implements ActionListener{

	private Tgi tgi;
	
	public TGIConsultVue(JFrame fenetre,Tgi t) {
		super(fenetre);
		tgi=t;
		setTitle("Consulter TGI");
		validerBouton.addActionListener(this);
		precedentBouton.addActionListener(this);
		nomText.setEditable(false);
		adresseText.setEditable(false);
		telText.setEditable(false);
		this.nomText.setText(t.getNom());
		this.adresseText.setText(t.getAdresse());
		this.telText.setText(t.getTel());
		
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
