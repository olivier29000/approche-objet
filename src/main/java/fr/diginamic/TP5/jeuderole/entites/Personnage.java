package fr.diginamic.TP5.jeuderole.entites;

import java.util.Random;

public class Personnage extends Mammifere {

	private int score;
	private int chance;

	public Personnage() {
		super(new Random().nextInt((18 - 12) + 1) + 12, new Random().nextInt((50 - 20) + 1) + 20,
				new Random().nextInt((40 - 20) + 1) + 20);
		this.score = 0;
		this.chance = new Random().nextInt((20 - 1) + 1) + 1;

		System.out.println("Felicitation, voici votre personnage ( Force: " + this.getForce() + ", PV: "
				+ this.getPointsDeVie() + ", Velocite: " + this.getVelocite() + ", Score: " + this.getScore()
				+ ", Chance: " + this.getChance() + ")");
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getChance() {
		return chance;
	}

	public void setChance(int chance) {
		this.chance = chance;
	}

}
