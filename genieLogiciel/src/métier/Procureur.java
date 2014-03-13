package métier;

public class Procureur extends Modele {
	
	private String nom,prenom;
	private Titre titre;
	private Tgi tgi;
	
	public Procureur(){
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTitre() {
		return titre.getNomTitre();
	}

	public void setTitre(String titre) {
		this.titre.setNomTitre(titre);
	}

	public Tgi getTgi() {
		return tgi;
	}

	public void setTgi(Tgi tgi) {
		this.tgi = tgi;
	}

	public Procureur(String nom, String prenom, String titre, Tgi tgi) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.titre.setNomTitre(titre);
		this.tgi = tgi;
	}
}
