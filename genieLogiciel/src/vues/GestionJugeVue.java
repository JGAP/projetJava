package vues;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class GestionJugeVue extends GestionGeneraleVue implements ActionListener{

	public GestionJugeVue(JFrame page){
		super(page);

		label.setText("Gestion des Juges");
		//la JList
		JPanel listePanel=new JPanel();
		listePanel.setLayout(new BorderLayout());
		JLabel jugeLabel=new JLabel("Sélection d'un Juge :");
		jugeLabel.setForeground(Color.white);
		listePanel.add(jugeLabel,BorderLayout.NORTH);
		jugeLabel.setHorizontalAlignment(JLabel.LEFT);
		liste=new JList();	//JList(getListeJuge())
		listePanel.add(liste);

		//ajout des elements dans le content pane
		ecran.add(listePanel,BorderLayout.CENTER);
		listePanel.setBackground(Color.DARK_GRAY);

		//listener
		precedentBouton.addActionListener(this);
		ajoutBouton.addActionListener(this);
		modifierBouton.addActionListener(this);
		consulterBouton.addActionListener(this);
		supprimerBouton.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		Object source=e.getSource();
		if(source==precedentBouton){
			this.pagePrecedente.setVisible(true);
			dispose();
		}

		else if(source==ajoutBouton){
			new JugeAjoutVue(this);
			setVisible(false);
		}

		else if(source==modifierBouton){
			new JugeModifVue(this);
			setVisible(false);
		}

		else if(source==consulterBouton){
			new JugeConsultVue(this);
			setVisible(false);
		}

		else if(source==supprimerBouton){
			JOptionPane jop = new JOptionPane();            
			int option = jop.showConfirmDialog(null, "Voulez-vous supprimer le Greffier ?", "Suppression du Greffier", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);          
			if(option == JOptionPane.OK_OPTION){
				//Suppression
			}
			else{

			}
		}

	}
	

}
