package fr.diginamic.TP6;

public class Rectangle extends Forme {

	private long longueur;
	private long largeur;

	public Rectangle(long longueur, long largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
		System.out.println("vous venez de créer un rectangle de longueur " + longueur + " et de largeur " + largeur);
	}

	@Override
	public double calculerSurface() {
		// TODO Auto-generated method stub
		return longueur * largeur;
	}

	@Override
	public long calculerPerimetre() {
		// TODO Auto-generated method stub
		return 2 * longueur + 2 * largeur;
	}

	public long getLongueur() {
		return longueur;
	}

	public void setLongueur(long longueur) {
		this.longueur = longueur;
	}

	public long getLargeur() {
		return largeur;
	}

	public void setLargeur(long largeur) {
		this.largeur = largeur;
	}

}