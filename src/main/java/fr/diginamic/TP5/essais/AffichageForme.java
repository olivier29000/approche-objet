package fr.diginamic.TP5.essais;

import fr.diginamic.TP5.entites.Forme;

public class AffichageForme {

	public void afficher(Forme forme) {

		System.out.println(afficherPerimetre(forme));
		System.out.println(afficherSurface(forme));
	}

	private long afficherPerimetre(Forme forme) {
		return forme.calculerPerimetre();
	}

	private long afficherSurface(Forme forme) {
		return forme.calculerSurface();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
