import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.font.TextLayout;

import javax.swing.*;


public class AMC_TGIVue extends JFrame implements MouseListener{
	
	protected JFrame pagePrecedente;
	protected JButton validerBouton,precedentBouton;
	protected JLabel nomLabel,adresseLabel,telLabel;
	protected JTextField nomText,adresseText,telText;
	
	//container
	protected JPanel nordPanel=new JPanel();
	protected JPanel labelPanel=new JPanel();
	protected JPanel textPanel=new JPanel();
	protected JPanel centrePanel=new JPanel();
	protected JPanel ecranPanel=new JPanel();
	protected JPanel boutonPanel=new JPanel();
	final Dimension dimLabel=new Dimension();
	
	protected Color couleurBouton;			//couleur de fond par defaut des JButton
	
	public AMC_TGIVue(JFrame fenetre){
		pagePrecedente=fenetre;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(380,235);
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
		
		//les zones de texte
		//on ajoutera les zones de texte en colonne
		textPanel.setLayout(new BoxLayout(textPanel,BoxLayout.PAGE_AXIS));
		//dimension des zones de texte
		final Dimension djtf=new Dimension();
		djtf.setSize(0.7*x,0.1*y);
		//création des zones de texte
		nomText=new JTextField();
		nomText.setPreferredSize(djtf);
		textPanel.add(nomText);
		adresseText=new JTextField();
		adresseText.setPreferredSize(djtf);
		textPanel.add(adresseText);
		telText=new JTextField();
		telText.setPreferredSize(djtf);
		textPanel.add(telText);
				
		//les labels
		//Dimension des labels
		final Dimension dlab=new Dimension();
		dlab.setSize(0.2*x,0.08*y);
		//BorderLayout obligatoire pour utiliser setHorizontalAlignment pour aligner à droite
		labelPanel.setLayout(new BorderLayout());
		nomLabel=new JLabel("  Nom : ");
		nomLabel.setPreferredSize(dlab);
		labelPanel.add(nomLabel,BorderLayout.NORTH);
		nomLabel.setHorizontalAlignment(JLabel.RIGHT);
		adresseLabel=new JLabel("Prenom : ");
		adresseLabel.setPreferredSize(dlab);
		labelPanel.add(adresseLabel,BorderLayout.CENTER);
		adresseLabel.setHorizontalAlignment(JLabel.RIGHT);
		telLabel=new JLabel("   Telephone : ");
		telLabel.setPreferredSize(dlab);
		labelPanel.add(telLabel,BorderLayout.SOUTH);
		telLabel.setHorizontalAlignment(JLabel.RIGHT);
				
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
