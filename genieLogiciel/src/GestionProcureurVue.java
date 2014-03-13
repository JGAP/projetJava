import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class GestionProcureurVue extends GestionGeneraleVue implements ActionListener{

	public GestionProcureurVue(JFrame page){
		super(page);
		
		label.setText("Gestion des Procureurs");
		//la JList
		JPanel listePanel=new JPanel();
		listePanel.setLayout(new BorderLayout());
		JLabel procureurLabel=new JLabel("Sélection d'un Procureur :");
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
		if(source==precedentBouton){
			this.pagePrecedente.setVisible(true);
			dispose();
		}
		
		else if(source==ajoutBouton){
			new ProcureurAjoutVue(this);
			setVisible(false);
		}
		
		else if(source==modifierBouton){
			new ProcureurModifVue(this);
			setVisible(false);
		}
		
		else if(source==consulterBouton){
			new ProcureurConsultVue(this);
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
