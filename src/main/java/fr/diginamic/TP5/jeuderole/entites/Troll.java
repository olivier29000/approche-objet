package fr.diginamic.TP5.jeuderole.entites;

import java.util.Random;

public class Troll extends Creature {

	public Troll() {
		super(new Random().nextInt((20 - 12) + 1) + 12, new Random().nextInt((30 - 20) + 1) + 20,
				new Random().nextInt((25 - 5) + 1) + 5, new Random().nextInt((30 - 20) + 1) + 20);
		System.out.println("vous venez de croiser un Troll (" + this.getForce() + "," + this.getPointsDeVie() + ","
				+ this.getVelocite() + "," + this.getMoral() + ")");
	}

	@Override
	public int Parer() {
		// TODO Auto-generated method stub
		return 0;
	}

}
