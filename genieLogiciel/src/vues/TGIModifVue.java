package vues;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import m�tier.Tgi;


public class TGIModifVue extends AMC_TGIVue implements ActionListener{

	private Tgi tgi;
	public TGIModifVue(JFrame fenetre,Tgi t) {
		super(fenetre);
		tgi=t;
		setTitle("Modifier TGI");
		this.nomText.setText(t.getNom());
		this.adresseText.setText(t.getAdresse());
		this.telText.setText(t.getTel());
		precedentBouton.addActionListener(this);
		validerBouton.addActionListener(this);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source=e.getSource();
		if(source==validerBouton){
			//Modifications
			tgi.setNom(nomText.getText());
			tgi.setAdresse(adresseText.getText());
			tgi.setTel(telText.getText());
			pagePrecedente.setVisible(true);
			dispose();
		}
		
		if(source==precedentBouton){
			this.pagePrecedente.setVisible(true);
			dispose();
		}
	}
	

}
