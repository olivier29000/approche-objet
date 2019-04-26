package fr.diginamic.TP5.entites;

public class Cercle extends Forme {

	private long rayon;

	public Cercle(long rayon) {
		this.rayon = rayon;
		System.out.println("vous venez de créer un cercle de rayon " + rayon);
	}

	public long getRayon() {
		return rayon;
	}

	public void setRayon(long rayon) {
		this.rayon = rayon;
	}

	@Override
	public long calculerSurface() {

		return rayon * rayon * 314 / 100;
	}

	@Override
	public long calculerPerimetre() {
		// TODO Auto-generated method stub
		return 2 * rayon * 314 / 100;
	}
}
