package vues;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.*;

import métier.ListeTgi;
import métier.Tgi;



public class GestionCourVue extends GestionGeneraleVue implements ActionListener{

	public GestionCourVue(JFrame page){
		super(page);

		label.setText("Gestion des Cours");
		//la JList
		JPanel listePanel=new JPanel();
		listePanel.setLayout(new BorderLayout());
		JLabel tgiLabel=new JLabel("Sélection d'une Cour :");
		tgiLabel.setForeground(Color.WHITE);
		listePanel.add(tgiLabel,BorderLayout.NORTH);
		tgiLabel.setHorizontalAlignment(JLabel.LEFT);
		//test de JList
		Vector<Tgi> listeObjet=new Vector();
		Tgi tgi1=new Tgi("Tgi Montpellier","50 route d'Adeline","061285252");
		Tgi tgi2=new Tgi("Tgi Nimes","250 route d'Adeline","0612852554");
		listeObjet.add(tgi1);
		listeObjet.add(tgi2);
		liste=new JList<Tgi>(listeObjet);	//JList(getListeTgi())
		liste.setBackground(Color.orange);
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
			//new CourAjoutVue(this);
			setVisible(false);
		}

		else{

			if(liste.getSelectedValuesList().size()!=1){	//si on a sélectionné plus ou moins de 1 valeurs
				JOptionPane jop = new JOptionPane();
				jop.showMessageDialog(null, "Ne sélectionner un seul TGI", "Erreur", JOptionPane.ERROR_MESSAGE);
				/**
				 * Déselectionner les cases sélectionnées
				 */
			}

			else{
				 if(source==modifierBouton){
					Tgi t=new Tgi();
					t=(Tgi) liste.getSelectedValuesList().get(0);
					//System.out.println(liste.getSelectedValuesList().get(0));
					//new CourModifVue(this,t);
					setVisible(false);

				}

				else if(source==consulterBouton){
					Tgi t=new Tgi();
					t=(Tgi) liste.getSelectedValuesList().get(0);
					//new CourConsultVue(this,t);
					setVisible(false);
				}

				else if(source==supprimerBouton){
					JOptionPane jop = new JOptionPane();            
					int option = jop.showConfirmDialog(null, "Voulez-vous supprimer le TGI ?", "Suppression du TGI", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);          
					if(option == JOptionPane.OK_OPTION){
						//Suppression
					}
					else{

					}
				}
			}
		}
	}

}


