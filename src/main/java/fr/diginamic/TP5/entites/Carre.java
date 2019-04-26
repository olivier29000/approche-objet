package fr.diginamic.TP5.entites;

public class Carre extends Rectangle {

	public Carre(long longueur) {
		super(longueur, longueur);

		System.out.println("vous venez de créer un carré de côté " + longueur);
	}

}
