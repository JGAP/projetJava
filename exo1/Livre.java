public class Livre {
	/****Paola***/
  // Variables
  private String titre, auteur;
  private int nbPages;

  // Constructeur
  public Livre(String unAuteur, String unTitre) {
    auteur = unAuteur;
    titre = unTitre;
  }

  // Accesseur
  public String getAuteur() {
    return auteur;
  }

  // Modificateur
  void setNbPages(int n) {
    nbPages = n;
}

public static void main (String[] args){
	Livre l1=new Livre("victor hugo", "les miserables");
	Livre l2=new Livre("zola","germinal");
	System.out.println("auteur1: " + l1.getAuteur() + "\n auteur2 : "+ l2.getAuteur());

}
}