package atelier2B2;

	public class compte {
	private int numCompte;
	private double solde;

	public compte(int numCompte, double solde) {
		this.numCompte = numCompte;
		this.solde = solde;
	}
	
	public int getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public double ajouter(double argent)
	{
	 return this.solde+argent;
	}
	public double retirer(double argent)
	{
	 return this.solde-argent;
	}
	public double afficher()
	{
	 return this.solde;
	}

}
