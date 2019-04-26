package fr.diginamic.TP5.jeuderole.entites;

import java.util.Random;

public abstract class Mammifere {

	private int force;
	private int pointsDeVie;
	private int velocite;

	public Mammifere(int force, int pointsDeVie, int velocite) {
		this.force = force;
		this.pointsDeVie = pointsDeVie;
		this.velocite = velocite;
	}

	public int Attaquer() {

		Random r = new Random();

		return this.force + r.nextInt((10 - 1) + 1) + 1;
	}

	public int PerdrePointsDeVie(Mammifere mammifere, int pointsDeViePerdus) {
		mammifere.pointsDeVie = mammifere.pointsDeVie - pointsDeViePerdus;
		return mammifere.pointsDeVie;
	}

	public int Fuir() {
		Random r = new Random();

		return this.velocite + r.nextInt((10 - 1) + 1) + 1;
	}

	public int Parrer() {
		Random r = new Random();

		return (this.force + this.velocite) / 2 + r.nextInt((10 - 1) + 1) + 1;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getPointsDeVie() {
		return pointsDeVie;
	}

	public void setPointsDeVie(int pointsDeVie) {
		this.pointsDeVie = pointsDeVie;
	}

	public int getVelocite() {
		return velocite;
	}

	public void setVelocite(int velocite) {
		this.velocite = velocite;
	}
}
