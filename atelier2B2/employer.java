package atelier2B2;

public class employer {
	private String nom;
	private String prenom;
	private String adresse;
	private int anneeNaissance;
	private int anneeEncours;
	public employer(String nom, String prenom, String adresse, int anneeNaissance, int anneeEncours) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.anneeNaissance = anneeNaissance;
		this.anneeEncours = anneeEncours;
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getAnneeNaissance() {
		return anneeNaissance;
	}
	public void setAnneeNaissance(int anneeNaissance) {
		this.anneeNaissance = anneeNaissance;
	}
	public int getAnneeEncours() {
		return anneeEncours;
	}
	public void setAnneeEncours(int anneeEncours) {
		this.anneeEncours = anneeEncours;
	}
  	public int calculerAge(int anneeNaissance,int anneeActuel) {
  		return this.anneeEncours-this.anneeNaissance;
  	}
	public String toString() {
		return "employer [nom=" + this.nom + ", prenom=" + this.prenom + ", adresse=" + this.adresse + ", anneeNaissance="
				+ this.anneeNaissance + ", anneeEncours=" + this.anneeEncours + "]";
	}
	
	

}
