package vues;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import métier.Procureur;


public class ProcureurModifVue extends AMC_ProcureurVue implements ActionListener{

	Procureur procureur;
	public ProcureurModifVue(JFrame fenetre,Procureur p) {
		super(fenetre);
		procureur=p;
		setTitle("Modifier Procureur");
		precedentBouton.addActionListener(this);
		validerBouton.addActionListener(this);
		this.nomText.setText(p.getNom());
		this.prenomText.setText(p.getPrenom());
		//titre=JComboBox??
		//this.titreText.setText(p.getTitre());
		//sélectionner la case sélectionnée du JComboBox tgi
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source=e.getSource();
		if(source==validerBouton){
			//Modif
			procureur.setNom(nomText.getText());
			procureur.setPrenom(prenomText.getText());
			//procureur.setTitre(titreText.getText());
			//procureur.setTgi(tgiSelectionne);
			pagePrecedente.setVisible(true);
			dispose();
		}
		
		if(source==precedentBouton){
			this.pagePrecedente.setVisible(true);
			dispose();
		}
	}
	

}
