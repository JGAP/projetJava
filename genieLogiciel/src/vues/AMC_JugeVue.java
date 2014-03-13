package vues;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;


public class AMC_JugeVue extends JFrame implements MouseListener{
	
	protected JFrame pagePrecedente;
	protected JButton validerBouton,precedentBouton;
	protected JLabel nomLabel,prenomLabel,titreLabel,tgiLabel,adresseLabel,telLabel,mobileLabel,faxLabel;
	protected JTextField nomText,prenomText,titreText,adresseText,telText,mobileText,faxText;
	protected JComboBox tgiCombo;
	
	//container
	protected JPanel nordPanel=new JPanel();
	protected JPanel labelPanel=new JPanel();
	protected JPanel textPanel=new JPanel();
	protected JPanel centrePanel=new JPanel();
	protected JPanel ecranPanel=new JPanel();
	protected JPanel boutonPanel=new JPanel();
	final Dimension dimLabel=new Dimension();
	
	protected Color couleurBouton;			//couleur de fond par defaut des JButton
	
	public AMC_JugeVue(JFrame fenetre){
		pagePrecedente=fenetre;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(550,200);
		//setResizable(false);
		setLocationRelativeTo(null);
		setAlwaysOnTop(true);
		
		double x=this.getWidth();
		double y=this.getHeight();
		
		//Panel du haut		(création de Panel pour bouton et label car probleme de placement et de dimension)
		precedentBouton=new JButton("<");
		nordPanel.setLayout(new BorderLayout());
		JPanel boutPanel=new JPanel();
		boutPanel.add(precedentBouton);
		nordPanel.add(boutPanel,BorderLayout.WEST);	
		JPanel labelPanel=new JPanel();
		nordPanel.add(labelPanel);
			
		//dimension du label
		Dimension dimLabel=new Dimension();
		dimLabel.setSize(getWidth(),getHeight()*0.15);
		nordPanel.setPreferredSize(dimLabel);
		
		//les zones de texte
		//on ajoutera les zones de texte en colonne
		textPanel.setLayout(new BoxLayout(textPanel,BoxLayout.PAGE_AXIS));
		//dimension des zones de texte
		final Dimension djtf=new Dimension();
		djtf.setSize(0.7*x,0.1*y);
		//création des zones de texte
		nomText=new JTextField();
		nomText.setPreferredSize(djtf);
		prenomText=new JTextField();
		prenomText.setPreferredSize(djtf);
		titreText=new JTextField();
		titreText.setPreferredSize(djtf);
		tgiCombo=new JComboBox();
		tgiCombo.setPreferredSize(djtf);
		adresseText=new JTextField();
		adresseLabel.setPreferredSize(djtf);
		telText=new JTextField();
		telText.setPreferredSize(djtf);
		mobileText.setPreferredSize(djtf);
		faxText=new JTextField();
		faxText.setPreferredSize(djtf);
				
		//les labels
		//Dimension des labels
		final Dimension dlab=new Dimension();
		dlab.setSize(0.3*x,0.08*y);
		nomLabel=new JLabel("  Nom : ");
		nomLabel.setPreferredSize(dlab);
		nomLabel.setHorizontalAlignment(JLabel.RIGHT);
		JPanel centre=new JPanel();
		prenomLabel=new JLabel("Prenom : ");
		prenomLabel.setPreferredSize(dlab);
		prenomLabel.setHorizontalAlignment(JLabel.RIGHT);
		titreLabel=new JLabel("   Titre : ");
		titreLabel.setHorizontalAlignment(JLabel.RIGHT);
		titreLabel.setPreferredSize(dlab);
		titreLabel.setHorizontalAlignment(JLabel.RIGHT);
		tgiLabel=new JLabel("TGI de rattachement :");
		tgiLabel.setPreferredSize(dlab);
		tgiLabel.setHorizontalAlignment(JLabel.RIGHT);
		adresseLabel=new JLabel("Adresse :");
		adresseLabel.setPreferredSize(dlab);
		telLabel=new JLabel("Téléphone :");
		telLabel.setPreferredSize(dlab);
		mobileLabel=new JLabel("Mobile :");
		mobileLabel.setPreferredSize(dlab);
		faxLabel=new JLabel("Fax : ");
		faxLabel.setPreferredSize(dlab);
		
		
		//ajouter des panels pour texte et label dans le panel central
		JPanel gauche=new JPanel();
		gauche.add(nomLabel);
		gauche.add(nomText);
		gauche.add(prenomLabel);
		gauche.add(prenomText);
		gauche.add(titreLabel);
		gauche.add(titreText);
		gauche.add(tgiLabel);
		gauche.add(tgiCombo);
		
		JPanel droit=new JPanel();
		droit.add(nomLabel);
		droit.add(nomText);
		droit.add(prenomLabel);
		droit.add(prenomText);
		droit.add(titreLabel);
		droit.add(titreText);
		droit.add(tgiLabel);
		droit.add(tgiCombo);
				
		//Panel central
		final Dimension d=new Dimension();
		d.setSize(x,0.4*y);
		//on ajoute en ligne les labels puis le texte
		centrePanel.setLayout(new BoxLayout(centrePanel,BoxLayout.LINE_AXIS));
		//petite bordure avec un titre
		centrePanel.setBorder(BorderFactory.createTitledBorder("Saisie des informations"));
		centrePanel.setPreferredSize(d);
		centrePanel.add(gauche);
		centrePanel.add(droit);
			
				
		
		validerBouton=new JButton("Valider");
		boutonPanel.add(validerBouton);
		Dimension dimBoutonPanel=new Dimension();
		dimBoutonPanel.setSize(x,0.15*y);
		boutonPanel.setPreferredSize(dimBoutonPanel);
		
		
		ecranPanel.setLayout(new BorderLayout());
		ecranPanel.add(nordPanel,BorderLayout.NORTH);
		ecranPanel.add(centrePanel);
		ecranPanel.add(boutonPanel,BorderLayout.SOUTH);
		setContentPane(ecranPanel);
		setVisible(true);
		
		//gestion des couleurs
		nordPanel.setBackground(Color.DARK_GRAY);
		textPanel.setBackground(Color.DARK_GRAY);
		boutPanel.setBackground(Color.DARK_GRAY);
		boutonPanel.setBackground(Color.DARK_GRAY);
		couleurBouton=precedentBouton.getBackground();					//couleur de fond du JButton
		precedentBouton.addMouseListener(this);
		validerBouton.addMouseListener(this);
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
