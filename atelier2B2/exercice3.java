package atelier2B2;

public class exercice3 {

	public static void main(String[] args) {
	compte c1=new compte(1,3000);
	compteEpargne ce1=new compteEpargne(1,300);
	System.out.println("num compte: "+c1.getNumCompte()+" solde :"+c1.afficher());
	if(ce1.getSolde()<200) {
	System.out.println(" la valeur minimale du solde est 200 MAD ")	;
	}
	else {
		System.out.println(" l'intérêt annuel : "+ce1.calculerInteret(5));
	}
	System.out.println(c1.ajouter(1000));
	System.out.println(c1.retirer(100));
	
	}

}
