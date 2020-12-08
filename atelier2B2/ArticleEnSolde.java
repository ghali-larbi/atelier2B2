package atelier2B2;

public class ArticleEnSolde extends Article {
	
public ArticleEnSolde(String nom,int prix)
{
	super(nom,prix);
}
 
 public int afficher() {
	 return super.afficher();
 }
 public double calculer() {
	 return super.afficher()*0.2;
 }
}
