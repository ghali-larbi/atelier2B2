package atelier2B2;

public class Enseignant extends Personne {
public String specialite;

public Enseignant(String nom, String prenom, String adresse, String ville, int dateNaissance, String specialite) {
	super(nom, prenom, adresse, ville, dateNaissance);
	this.specialite = specialite;
}

public String getSpecialite() {
	return specialite;
}

public void setSpecialite(String specialite) {
	this.specialite = specialite;
}

@Override
public String toString() {
	return super.toString()+"Enseignant [specialite=" + specialite + "]";
}

}
