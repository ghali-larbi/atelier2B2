package atelier2B2;

public class exercice1 {

	public static void main(String[] args) {
		employer e1=new employer("El alami","mohammed","casablanca",1963,2020);
		employer e2=new employer("El wahabi","khalid","safi",1990,2020);
		employer e3=new employer("sbai","fouad","sale",2006,2020);
		System.out.println(e1.toString());
		System.out.println("l'age est : "+e1.calculerAge(e1.getAnneeNaissance(),e1.getAnneeEncours()));
		System.out.println(e2.toString());
		System.out.println("l'age est : "+e2.calculerAge(e2.getAnneeNaissance(),e2.getAnneeEncours()));
		System.out.println(e3.toString());
		System.out.println("l'age est : "+e3.calculerAge(e3.getAnneeNaissance(),e3.getAnneeEncours()));

        
	}

}
