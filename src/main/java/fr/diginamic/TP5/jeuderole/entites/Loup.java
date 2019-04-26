package fr.diginamic.TP5.jeuderole.entites;

import java.util.Random;

public class Loup extends Creature {

	public Loup() {
		super(new Random().nextInt((50 - 40) + 1) + 40, new Random().nextInt((10 - 5) + 1) + 5,
				new Random().nextInt((20 - 10) + 1) + 10, new Random().nextInt((20 - 5) + 1) + 5);
		System.out.println("vous venez de croiser un loup (" + this.getForce() + "," + this.getPointsDeVie() + ","
				+ this.getVelocite() + "," + this.getMoral() + ")");
	}

	@Override
	public int Parer() {
		System.out.println("le loup essai de parrer votre coup en vous attrapant le bras avec ses canines");
		Random r = new Random();

		return r.nextInt() * 10 + 1;

	}

}
