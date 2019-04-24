package fr.diginamic.entites;

public class Cercle {
	public double rayonDuCercle;

	public Cercle(double rayon) {
		rayonDuCercle = rayon;

		System.out.println("Nouveau cercle créé avec un raon de ");
		System.out.println(rayonDuCercle);

	}

	public double getPerimetre() {
		return this.rayonDuCercle * 2 * Math.PI;
	}

	public double getSurface() {
		return this.rayonDuCercle * this.rayonDuCercle * Math.PI;
	}
}
