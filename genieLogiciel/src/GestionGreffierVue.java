import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class GestionGreffierVue extends GestionGeneraleVue implements ActionListener{

	public GestionGreffierVue(JFrame page){
		super(page);

		label.setText("Gestion des Greffiers");
		//la JList
		JPanel listePanel=new JPanel();
		listePanel.setLayout(new BorderLayout());
		JLabel greffierLabel=new JLabel("Sélection d'un Greffier :");
		greffierLabel.setForeground(Color.white);
		listePanel.add(greffierLabel,BorderLayout.NORTH);
		greffierLabel.setHorizontalAlignment(JLabel.LEFT);
		liste=new JList();	//JList(getListeGreffier())
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
			new GreffierAjoutVue(this);
			setVisible(false);
		}

		else if(source==modifierBouton){
			new GreffierModifVue(this);
			setVisible(false);
		}

		else if(source==consulterBouton){
			new GreffierConsultVue(this);
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
