import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class GestionTGIVue extends GestionGeneraleVue implements ActionListener{

	public GestionTGIVue(JFrame page){
		super(page);
		
		label.setText("Gestion des TGI");
		//la JList
		JPanel listePanel=new JPanel();
		listePanel.setLayout(new BorderLayout());
		JLabel tgiLabel=new JLabel("Sélection d'un TGI :");
		tgiLabel.setForeground(Color.WHITE);
		listePanel.add(tgiLabel,BorderLayout.NORTH);
		tgiLabel.setHorizontalAlignment(JLabel.LEFT);
		liste=new JList();	//JList(getListeTgi())
		//liste.setBackground(Color.gray);
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
			new TGIAjoutVue(this);
			setVisible(false);
		}
		
		else if(source==modifierBouton){
			new TGIModifVue(this);
			setVisible(false);
		}
		
		else if(source==consulterBouton){
			new TGIConsultVue(this);
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
