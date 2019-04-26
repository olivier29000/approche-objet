package fr.diginamic.TP5.jeuderole.essais;

import fr.diginamic.TP5.jeuderole.entites.Creature;
import fr.diginamic.TP5.jeuderole.entites.Mammifere;

public class Fuite {

	public Fuite(Mammifere combattant1, Creature combattant2) {

		int c1 = combattant1.Fuir();
		int c2 = combattant2.Fuir();
		int n = c1 - c2;

		if (n <= 0) {
			int blessureDeFuite = combattant2.Attaquer();
			combattant1.setPointsDeVie(combattant1.getPointsDeVie() - blessureDeFuite);
			System.out.println("le " + combattant2.getClass().getSimpleName() + " a fait perdre " + blessureDeFuite
					+ " au " + combattant1.getClass().getSimpleName());
			System.out.println(
					combattant1.getClass().getSimpleName() + ": " + combattant1.getPointsDeVie() + " PV restants");
			System.out.println(
					combattant2.getClass().getSimpleName() + ": " + combattant2.getPointsDeVie() + " PV restants");

		} else if (n > 0) {
			int essouflement = combattant2.Attaquer() / 5;
			combattant2.setForce(combattant2.getForce() - essouflement);
			combattant1.setVelocite(combattant1.getVelocite() / 10);
			System.out.println("le " + combattant1.getClass().getSimpleName() + " a fait perdre " + essouflement
					+ " de force au " + combattant2.getClass().getSimpleName());
			System.out.println(
					combattant1.getClass().getSimpleName() + ": " + combattant1.getPointsDeVie() + " PV restants");
			System.out.println(
					combattant2.getClass().getSimpleName() + ": " + combattant2.getPointsDeVie() + " PV restants");

		}

		if (combattant1.getPointsDeVie() <= 0) {
			System.out.println("le " + combattant1.getClass().getSimpleName() + " est mort");
		}
	}
}
