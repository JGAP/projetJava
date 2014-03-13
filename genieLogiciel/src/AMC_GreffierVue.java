import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.font.TextLayout;

import javax.swing.*;


public class AMC_GreffierVue extends JFrame implements MouseListener{
	
	protected JFrame pagePrecedente;
	protected JButton validerBouton,precedentBouton;
	protected JLabel nomLabel,adresseLabel,telLabel,mobileLabel,titreLabel,faxLabel,tgiLabel;
	protected JTextField nomText,adresseText,telText,mobileText,titreText,faxText;
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
	
	public AMC_GreffierVue(JFrame fenetre){
		pagePrecedente=fenetre;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,400);
		setResizable(false);
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
		
		//dimension de la moitie de l'ecran central pour bien aligner les labels et text
		Dimension dimMoitieLabel=new Dimension();
		dimMoitieLabel.setSize(labelPanel.getWidth()*0.5, labelPanel.getHeight()*0.5);
		
		//les zones de texte
		//on ajoutera les zones de texte en colonne
		textPanel.setLayout(new BoxLayout(textPanel,BoxLayout.PAGE_AXIS));
		//dimension des zones de texte
		final Dimension djtf=new Dimension();
		djtf.setSize(0.7*x,0.1*y);
		//création des zones de texte
		nomText=new JTextField();
		textPanel.add(nomText);
		nomText.setPreferredSize(djtf);
		adresseText=new JTextField();
		adresseText.setPreferredSize(djtf);
		textPanel.add(adresseText);
		titreText=new JTextField();
		titreText.setPreferredSize(djtf);
		textPanel.add(titreText,BorderLayout.SOUTH);
		telText=new JTextField();
		telText.setPreferredSize(djtf);
		textPanel.add(telText,BorderLayout.NORTH);
		mobileText=new JTextField();
		mobileText.setPreferredSize(djtf);
		textPanel.add(mobileText);
		faxText=new JTextField();
		faxText.setPreferredSize(djtf);
		textPanel.add(faxText,BorderLayout.SOUTH);
		//et de la liste des TGI
		tgiCombo=new JComboBox();
		textPanel.add(tgiCombo);
		
		//les labels
		//Dimension des labels
		final Dimension dlab=new Dimension();
		dlab.setSize(0.2*x,0.08*y);
		//BorderLayout obligatoire pour utiliser setHorizontalAlignment pour aligner à droite
		JPanel p1,p2,p3;
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		p1.setLayout(new BorderLayout());
		p2.setLayout(new BorderLayout());
		p3.setLayout(new BorderLayout());
		labelPanel.setLayout(new BorderLayout());
		
		nomLabel=new JLabel("     Nom : ");
		nomLabel.setPreferredSize(dlab);
		p1.add(nomLabel,BorderLayout.NORTH);
		nomLabel.setHorizontalAlignment(JLabel.RIGHT);
		adresseLabel=new JLabel("   Prenom : ");
		adresseLabel.setPreferredSize(dlab);
		p1.add(adresseLabel,BorderLayout.CENTER);
		adresseLabel.setHorizontalAlignment(JLabel.RIGHT);
		titreLabel=new JLabel("Titre :");
		titreLabel.setPreferredSize(dlab);
		p1.add(titreLabel,BorderLayout.SOUTH);
		titreLabel.setHorizontalAlignment(JLabel.RIGHT);
		p1.setSize(dimMoitieLabel);
		
		telLabel=new JLabel("      Telephone : ");
		telLabel.setPreferredSize(dlab);
		p2.add(telLabel,BorderLayout.NORTH);
		telLabel.setHorizontalAlignment(JLabel.RIGHT);
		p2.add(new JLabel(" "),BorderLayout.CENTER);			//pour l'alignement
		mobileLabel=new JLabel("Mobile :");
		mobileLabel.setPreferredSize(dlab);
		p2.add(mobileLabel,BorderLayout.SOUTH);
		mobileLabel.setHorizontalAlignment(JLabel.RIGHT);
		
		faxLabel=new JLabel("   Fax : ");
		p3.add(faxLabel);
		faxLabel.setPreferredSize(dlab);
		faxLabel.setHorizontalAlignment(JLabel.RIGHT);
		p2.setSize(dimMoitieLabel);
		tgiLabel=new JLabel("TGI :");
		tgiLabel.setPreferredSize(dlab);
		p3.add(tgiLabel,BorderLayout.SOUTH);
		tgiLabel.setHorizontalAlignment(JLabel.RIGHT);
		p3.setSize(dimMoitieLabel);
		
		//on ajoute les panels au panel des labels
		labelPanel.add(p1,BorderLayout.NORTH);
		labelPanel.add(p2,BorderLayout.CENTER);
		labelPanel.add(p3,BorderLayout.SOUTH);

				
		//Panel central
		final Dimension d=new Dimension();
		d.setSize(x,0.4*y);
		//on ajoute en ligne les labels puis le texte
		centrePanel.setLayout(new BoxLayout(centrePanel,BoxLayout.LINE_AXIS));
		//petite bordure avec un titre
		centrePanel.setBorder(BorderFactory.createTitledBorder("Saisie des informations"));
		centrePanel.setPreferredSize(d);
		centrePanel.add(labelPanel);
		centrePanel.add(textPanel);
			
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
