import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

//Vue dont héritera gestionTGI, gestionGreffier..

public class GestionGeneraleVue extends JFrame implements MouseListener {

	protected JFrame pagePrecedente;
	protected JLabel label=new JLabel();
	protected JButton ajoutBouton, modifierBouton, consulterBouton, supprimerBouton, precedentBouton;
	
	protected JList liste;
	
	//container
	protected JPanel boutonContainer=new JPanel();
	protected JPanel nordPanel=new JPanel(); 		//label + bouton précédent
	protected JPanel ecran=new JPanel();
		
	protected Color couleurBouton;			//couleur de fond par defaut des JButton
	
	public GestionGeneraleVue(JFrame page){
		pagePrecedente=page;
		setTitle("Gestion des Instances Juridiques");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(650,500);
		setLocationRelativeTo(null);
		
		//Panel du haut		(création de Panel pour bouton et label car probleme de placement et de dimension)
		precedentBouton=new JButton("<");
		nordPanel.setLayout(new BorderLayout());
		JPanel boutPanel=new JPanel();
		boutPanel.add(precedentBouton);
		nordPanel.add(boutPanel,BorderLayout.WEST);	
		JPanel labelPanel=new JPanel();
		labelPanel.add(label);
		label.setForeground(Color.white);
		labelPanel.setBackground(Color.DARK_GRAY);
		nordPanel.add(labelPanel);
		
		//dimension du label
		Dimension dimLabel=new Dimension();
		dimLabel.setSize(getWidth(),getHeight()*0.15);
		nordPanel.setPreferredSize(dimLabel);
		
		//Panel des boutons
		JPanel p1,p2,p3,p4;
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		p4=new JPanel();
		Dimension dimBouton=new Dimension();
		ajoutBouton=new JButton(" Ajouter  ");
		p1.add(ajoutBouton);
		modifierBouton=new JButton(" Modifier ");
		p2.add(modifierBouton);
		consulterBouton=new JButton("Consulter");
		p3.add(consulterBouton);
		supprimerBouton=new JButton("Supprimer");
		p4.add(supprimerBouton);
		dimBouton.setSize(p4.getPreferredSize());
		p1.setPreferredSize(dimBouton);
		p2.setPreferredSize(dimBouton);
				
		boutonContainer.setLayout(new BoxLayout(boutonContainer,BoxLayout.PAGE_AXIS));
		Dimension dimContainer=new Dimension();
		dimContainer.setSize(getWidth()*0.3, getHeight()*0.6);
		boutonContainer.setPreferredSize(dimContainer);
		boutonContainer.add(p1);
		boutonContainer.add(p2);
		boutonContainer.add(p3);
		boutonContainer.add(p4);
		
		//listener
		precedentBouton.addMouseListener(this);
		ajoutBouton.addMouseListener(this);
		modifierBouton.addMouseListener(this);
		consulterBouton.addMouseListener(this);
		supprimerBouton.addMouseListener(this);

		
		//ajout des elements dans le content pane
		ecran.setLayout(new BorderLayout());
		ecran.add(nordPanel,BorderLayout.NORTH);
		ecran.add(boutonContainer,BorderLayout.EAST);

		setContentPane(ecran);
		setVisible(true);

		//gestion des couleurs
		nordPanel.setBackground(Color.DARK_GRAY);
		p1.setBackground(Color.DARK_GRAY);
		p2.setBackground(Color.DARK_GRAY);
		p3.setBackground(Color.DARK_GRAY);
		p4.setBackground(Color.DARK_GRAY);
		boutPanel.setBackground(Color.DARK_GRAY);
		couleurBouton=precedentBouton.getBackground();					//couleur de fond du JButton
		
	}
	
	


	//Juste pour changer la couleur au survol de la souris
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		((JComponent) e.getSource()).setBackground(Color.ORANGE);		//on change la couleur au survol de la souris
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		((JComponent) e.getSource()).setBackground(couleurBouton);			//on remet la couleur par defaut
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	

}
