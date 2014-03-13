package vues;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import m�tier.Procureur;



public class GestionProcureurVue extends GestionGeneraleVue implements ActionListener{

	public GestionProcureurVue(JFrame page){
		super(page);

		label.setText("Gestion des Procureurs");
		//la JList
		JPanel listePanel=new JPanel();
		listePanel.setLayout(new BorderLayout());
		JLabel procureurLabel=new JLabel("S�lection d'un Procureur :");
		procureurLabel.setForeground(Color.WHITE);
		listePanel.add(procureurLabel,BorderLayout.NORTH);
		procureurLabel.setHorizontalAlignment(JLabel.LEFT);
		liste=new JList();	//JList(getListeProcureur())
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
		if(liste.getSelectedValuesList().size()>1){	//si on a s�lectionn� plus de 1 valeurs
			JOptionPane jop = new JOptionPane();
			jop.showMessageDialog(null, "Ne s�lectionner au plus qu'un Procureur", "Erreur", JOptionPane.ERROR_MESSAGE);
			/**
			 * D�selectionner les cases s�lectionn�es
			 */
		}
		else{
			if(source==precedentBouton){
				this.pagePrecedente.setVisible(true);
				dispose();
			}

			else if(source==ajoutBouton){
				Procureur p=new Procureur();
				p=(Procureur) liste.getSelectedValuesList().get(0);
				new ProcureurAjoutVue(this);
				setVisible(false);
			}

			else if(source==modifierBouton){
				Procureur p=new Procureur();
				p=(Procureur) liste.getSelectedValuesList().get(0);
				new ProcureurModifVue(this);
				setVisible(false);
			}

			else if(source==consulterBouton){
				new ProcureurConsultVue(this);
				setVisible(false);
			}

			else if(source==supprimerBouton){
				JOptionPane jop = new JOptionPane();            
				int option = jop.showConfirmDialog(null, "Voulez-vous supprimer le Procureur ?", "Suppression du Procureur", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);          
				if(option == JOptionPane.OK_OPTION){
					//Suppression
				}
				else{

				}
			}

		}
	}

}
