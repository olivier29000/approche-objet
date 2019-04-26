package fr.diginamic.TP5.jeuderole.entites;

import java.util.Random;

public class Gobelin extends Creature {

	public Gobelin() {
		super(new Random().nextInt((12 - 7) + 1) + 7, new Random().nextInt((15 - 10) + 1) + 10,
				new Random().nextInt((15 - 5) + 1) + 5, new Random().nextInt((8 - 1) + 1) + 1);
		System.out.println("vous venez de croiser un gobelin (" + this.getForce() + "," + this.getPointsDeVie() + ","
				+ this.getVelocite() + "," + this.getMoral() + ")");
	}

	@Override
	public int Parer() {
		// TODO Auto-generated method stub
		return 0;
	}
}
