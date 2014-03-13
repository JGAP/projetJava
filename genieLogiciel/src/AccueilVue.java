import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;


public class AccueilVue extends JFrame implements ActionListener,MouseListener {
	
	private JButton instanceBouton, enqueteurBouton, affaireBouton, tbBouton, comptaBouton, deconnexionBouton;
	private JLabel bienvenueLabel=new JLabel("BIENVENUE");
	//les boutons seront de meme dimension :
	final Dimension dimBouton=new Dimension();
	
	//logo
	private JLabel logo=new JLabel(new ImageIcon("logoJGAP.png"));
	
	//container
	private JPanel boutonContainer=new JPanel();	//container des boutons
	private JPanel ecranAccueil=new JPanel();		//container qui est le contentPane

	private Color couleurBouton;			//couleur de fond par defaut des JButton
	
	public AccueilVue(){
		setTitle("Accueil");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(650,500);
		setLocationRelativeTo(null);
		setAlwaysOnTop(true);
		
		
		//Instanciation des boutons
		instanceBouton=new JButton("Instances Juridiques");
		enqueteurBouton=new JButton("Enqueteurs");
		affaireBouton=new JButton("Affaires");
		tbBouton=new JButton("Tableau de bord");
		comptaBouton=new JButton("Comptabilité Analytique");
		deconnexionBouton=new JButton("Deconnexion");
		
		//tous les boutons de la dimension de compta (plus grande chaine donc taille max)
		dimBouton.setSize(comptaBouton.getPreferredSize());
		instanceBouton.setPreferredSize(dimBouton);
		enqueteurBouton.setPreferredSize(dimBouton);
		affaireBouton.setPreferredSize(dimBouton);
		tbBouton.setPreferredSize(dimBouton);
		deconnexionBouton.setPreferredSize(dimBouton);
		
		//placement des boutons dans le container
		//boutonContainer.setBorder(BorderFactory.createTitledBorder("Faite votre choix"));
		GridLayout grille=new GridLayout(2,3);
		grille.setVgap(15); 			//espace entre les lignes
		boutonContainer.setLayout(grille);
		boutonContainer.add(instanceBouton);
		boutonContainer.add(enqueteurBouton);
		boutonContainer.add(affaireBouton);
		boutonContainer.add(tbBouton);
		boutonContainer.add(comptaBouton);
		boutonContainer.add(deconnexionBouton);
		
		//listeners
		instanceBouton.addActionListener(this);
		enqueteurBouton.addActionListener(this);
		affaireBouton.addActionListener(this);
		tbBouton.addActionListener(this);
		comptaBouton.addActionListener(this);
		deconnexionBouton.addActionListener(this);
		
		instanceBouton.addMouseListener(this);
		enqueteurBouton.addMouseListener(this);
		affaireBouton.addMouseListener(this);
		tbBouton.addMouseListener(this);
		comptaBouton.addMouseListener(this);
		deconnexionBouton.addMouseListener(this);
		
		//propriétés sur le content pane
		ecranAccueil.setLayout(new BorderLayout());
		ecranAccueil.add(bienvenueLabel,BorderLayout.NORTH);
		bienvenueLabel.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		
		ecranAccueil.add(logo,BorderLayout.CENTER);
		ecranAccueil.add(boutonContainer,BorderLayout.SOUTH);
		
		//gestion des couleurs
		bienvenueLabel.setForeground(Color.white);
		ecranAccueil.setBackground(Color.DARK_GRAY);
		boutonContainer.setBackground(Color.DARK_GRAY);
		setContentPane(ecranAccueil);
		setVisible(true);
		
		couleurBouton=instanceBouton.getBackground();					//couleur de fond du JButton
		
	}
	
	public void actionPerformed(ActionEvent e) {
		Object source=e.getSource();
		
		if(source==instanceBouton){
			setVisible(false);
			new GestionInstanceVue(this);
		}
		
		else if(source==deconnexionBouton)
			dispose();		//on ferme la fenetre
		
	}



	public static void main(String[] args){
		AccueilVue a=new AccueilVue();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
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
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


}
