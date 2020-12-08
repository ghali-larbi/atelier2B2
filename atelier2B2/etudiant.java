package atelier2B2;

public class etudiant extends Personne {
public String diplome;

public etudiant(String nom, String prenom, String adresse, String ville, int dateNaissance, String diplome) {
	super(nom, prenom, adresse, ville, dateNaissance);
	this.diplome = diplome;
}

public String getDiplome() {
	return diplome;
}

public void setDiplome(String diplome) {
	this.diplome = diplome;
}

@Override
public String toString() {
	return super.toString()+"etudiant [diplome=" + diplome + "]";
}

}
