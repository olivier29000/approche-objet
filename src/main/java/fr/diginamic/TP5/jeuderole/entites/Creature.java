package fr.diginamic.TP5.jeuderole.entites;

public abstract class Creature extends Mammifere {

	public int moral;

	Creature(int force, int pointsDeVie, int velocite, int moral) {
		super(force, pointsDeVie, velocite);
		this.moral = moral;
	}

	public abstract int Parer();

	public int getMoral() {
		return moral;
	}

	public void setMoral(int moral) {
		this.moral = moral;
	}

}
