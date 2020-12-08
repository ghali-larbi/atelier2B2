package atelier2B2;

public class compteEpargne extends compte{
  public compteEpargne(int numCompte,double solde) {
	  super(numCompte,solde);
  }
  public double calculerInteret(double interet) {
	  return super.afficher()*interet;
  }
}
