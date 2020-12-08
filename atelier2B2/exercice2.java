package atelier2B2;

public class exercice2 {

	public static void main(String[] args) {
	Article a1= new Article("art", 2000);
	ArticleEnSolde a2= new ArticleEnSolde("art", 2000);
	System.out.println("prix est : "+a1.afficher());
	System.out.println(""+a2.calculer());
	}

}
