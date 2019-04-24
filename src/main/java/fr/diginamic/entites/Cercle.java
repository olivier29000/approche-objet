package fr.diginamic.entites;

public class Cercle {
	private double rayonDuCercle;

	public Cercle(double rayon) {
		rayonDuCercle = rayon;

		System.out.println("Nouveau cercle créé avec un rayon de ");
		System.out.println(rayonDuCercle);

	}

	public double getPerimetre() {
		return this.rayonDuCercle * 2 * Math.PI;
	}

	public double getRayon() {
		return this.rayonDuCercle;
	}

	public double getSurface() {
		return this.rayonDuCercle * this.rayonDuCercle * Math.PI;
	}

	public double getRayonDuCercle() {
		return rayonDuCercle;
	}

	public void setRayonDuCercle(double rayonDuCercle) {
		this.rayonDuCercle = rayonDuCercle;
	}
}
