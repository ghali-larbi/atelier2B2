package atelier2B2;

public class secretaire extends Personne {
  public int numeroBureau;
  



public secretaire(String nom, String prenom, String adresse, String ville, int dateNaissance, int numeroBureau) {
	super(nom, prenom, adresse, ville, dateNaissance);
	this.numeroBureau = numeroBureau;
}

public int getNumeroBureau() {
	return numeroBureau;
}

public void setNumeroBureau(int numeroBureau) {
	this.numeroBureau = numeroBureau;
}

@Override
public String toString() {
	return super.toString()+"secretaire [numeroBureau=" + numeroBureau + "]";
}
  
}
