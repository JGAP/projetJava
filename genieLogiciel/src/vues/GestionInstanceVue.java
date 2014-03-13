package vues;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;


public class GestionInstanceVue extends JFrame implements ActionListener, MouseListener{
	
	private JFrame pagePrecedente;
	private JButton tgiBouton, greffierBouton, jugeBouton, serviceTGIBouton, courAppelBouton, procureurBouton, titreBouton,precedentBouton;
	//logo
	private JLabel logo=new JLabel(new ImageIcon("logoJGAP.png"));
	
	//Dimension des boutons
	final Dimension dimBouton=new Dimension();
	
	
	//container
	private JPanel nordPanel=new JPanel();
	private JPanel boutonContainer=new JPanel();	//container des boutons
	private JPanel ecranInstance=new JPanel();		//container qui est le contentPane
	
	private Color couleurBouton;			//couleur de fond par defaut des JButton
	
	public GestionInstanceVue(JFrame page){
		pagePrecedente=page;
		setTitle("Gestion des Instances Juridiques");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(650,500);
		setLocationRelativeTo(null);
		setAlwaysOnTop(true);
		
		//Panel du haut
		precedentBouton=new JButton("<");
		nordPanel.setLayout(new BorderLayout());
		nordPanel.add(precedentBouton, BorderLayout.WEST);
		
		//Instanciation des boutons
		tgiBouton=new JButton("TGI");
		greffierBouton=new JButton("Greffiers");
		jugeBouton=new JButton("Juges");
		serviceTGIBouton=new JButton("Services TGI");
		courAppelBouton=new JButton("Cours d'Appel");
		procureurBouton=new JButton("Procureurs");
		titreBouton=new JButton("Titres");
		
		//dimension des boutons
		dimBouton.setSize(courAppelBouton.getPreferredSize());
		tgiBouton.setPreferredSize(dimBouton);
		greffierBouton.setPreferredSize(dimBouton);
		jugeBouton.setPreferredSize(dimBouton);
		serviceTGIBouton.setPreferredSize(dimBouton);
		courAppelBouton.setPreferredSize(dimBouton);
		procureurBouton.setPreferredSize(dimBouton);
		titreBouton.setPreferredSize(dimBouton);
	
		//listener
		tgiBouton.addActionListener(this);
		greffierBouton.addActionListener(this);
		jugeBouton.addActionListener(this);
		serviceTGIBouton.addActionListener(this);
		courAppelBouton.addActionListener(this);
		procureurBouton.addActionListener(this);
		titreBouton.addActionListener(this);
		precedentBouton.addActionListener(this);

		tgiBouton.addMouseListener(this);
		greffierBouton.addMouseListener(this);
		jugeBouton.addMouseListener(this);
		serviceTGIBouton.addMouseListener(this);
		courAppelBouton.addMouseListener(this);
		procureurBouton.addMouseListener(this);
		titreBouton.addMouseListener(this);
		precedentBouton.addMouseListener(this);
		
		
		JPanel ligne1=new JPanel();
		ligne1.add(tgiBouton);
		ligne1.add(greffierBouton);
		ligne1.add(jugeBouton);
		ligne1.add(serviceTGIBouton);
		
		JPanel ligne2=new JPanel();
		ligne2.add(courAppelBouton);
		ligne2.add(procureurBouton);
		ligne2.add(titreBouton);
		
		boutonContainer.setLayout(new BoxLayout(boutonContainer,BoxLayout.PAGE_AXIS));
		//boutonContainer.setBorder(BorderFactory.createTitledBorder("Faite votre choix"));
		boutonContainer.add(ligne1);
		boutonContainer.add(ligne2);
		
		//placement des elements
		ecranInstance.setLayout(new BorderLayout());
		ecranInstance.add(nordPanel,BorderLayout.NORTH);
		ecranInstance.add(logo);
		ecranInstance.add(boutonContainer,BorderLayout.SOUTH);
		
		setContentPane(ecranInstance);
		setVisible(true);
		
		//gestion des couleurs
		nordPanel.setBackground(Color.DARK_GRAY);
		ecranInstance.setBackground(Color.DARK_GRAY);
		ligne1.setBackground(Color.DARK_GRAY);
		ligne2.setBackground(Color.DARK_GRAY);
		boutonContainer.setBackground(Color.black);
		couleurBouton=precedentBouton.getBackground();					//couleur de fond du JButton
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source=e.getSource();
		//On ouvre la vue selon le bouton cliqué
		
		if(source==tgiBouton){
			setVisible(false);
			new GestionTGIVue(this);
		}
		else if(source==greffierBouton){
			setVisible(false);
			new GestionGreffierVue(this);
		}
		
		else if(source==jugeBouton){
			setVisible(false);
			new GestionJugeVue(this);
		}
		
		else if(source==serviceTGIBouton){
			setVisible(false);
			//new GestionServiceTGIVue(this);
		}
		
		else if(source==courAppelBouton){
			setVisible(false);
			//new GestionCourVue(this);
		}
		
		else if(source==procureurBouton){
			setVisible(false);
			new GestionProcureurVue(this);
		}
		
		else if(source==titreBouton){
			setVisible(false);
			//new GestionTitreVue(this);
		}
		
		//si on clique sur precedent on revient
		else if(source==precedentBouton){
			this.pagePrecedente.setVisible(true);
			dispose();
		}
		
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
