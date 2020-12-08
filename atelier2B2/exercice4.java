package atelier2B2;

public class exercice4 {

	public static void main(String[] args) {
		Personne p=new Personne("per1", "per1", "safi", "safi", 2000);
		secretaire s=new secretaire("gggg", "gg", "safi", "safi", 2000, 1);
	    Enseignant en=new Enseignant("ghali", "larbi", "safi", "safi", 2000,"math");
	    etudiant e=new etudiant("ghali2", "larbi2", "safi", "safi", 2000,"tdi");
	   System.out.println(s.toString());
	   System.out.println(e.toString());
	   System.out.println(en.toString());
	   p.modifiePersonne("casa", "casa");
	   System.out.println(p.ecrirePersonne());
	   System.out.println("nombre personne: "+p.getNbr());
	}

}
