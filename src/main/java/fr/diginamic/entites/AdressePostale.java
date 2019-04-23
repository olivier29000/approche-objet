package fr.diginamic.entites;

public class AdressePostale {

	public int numeroRue;
	public String libelleRue;
	public int codePostal;
	public String ville;

	public static int nbDepartements = 101;

	public AdressePostale(int paramNumeroRue, String paramLibelleRue, int paramCodePostal, String paramVille) {
		// TODO Auto-generated constructor stub

		numeroRue = paramNumeroRue;
		libelleRue = paramLibelleRue;
		codePostal = paramCodePostal;
		ville = paramVille;

		System.out.println("vous venez de créer l'adresse");
		System.out.println(paramNumeroRue);
		System.out.println(paramLibelleRue);
		System.out.println(paramCodePostal);
		System.out.println(paramVille);
	}

}
