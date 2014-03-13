package métier;

public class Tgi extends Modele {
	
	private String nom,adresse,tel;
	
	public Tgi(){
		
	}

	public Tgi(String nom, String adresse, String tel)  {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.tel = tel;
	}
	
	
	//methode de base
	
	public void save(){
		
	}
	
	@Override
	public String toString() {
		return "Nom du TGI : " + nom;
	}

	public void load(){
		
	}
	
	//getters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}
	
	//setters

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
