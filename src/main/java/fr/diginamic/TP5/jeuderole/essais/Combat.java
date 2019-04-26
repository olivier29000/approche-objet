package fr.diginamic.TP5.jeuderole.essais;

import fr.diginamic.TP5.jeuderole.entites.Mammifere;

public class Combat {

	public Combat(Mammifere combattant1, Mammifere combattant2) {

		int c1 = combattant1.Attaquer();
		int c2 = combattant2.Attaquer();
		int n = c1 - c2;

		if (n < 0) {
			combattant1.setPointsDeVie(combattant1.getPointsDeVie() + n);
			System.out.println("le " + combattant2.getClass().getSimpleName() + " a fait perdre " + n + " au "
					+ combattant1.getClass().getSimpleName());
			System.out.println(
					combattant1.getClass().getSimpleName() + ": " + combattant1.getPointsDeVie() + " PV restants");
			System.out.println(
					combattant2.getClass().getSimpleName() + ": " + combattant2.getPointsDeVie() + " PV restants");

		} else if (n > 0) {
			combattant2.setPointsDeVie(combattant2.getPointsDeVie() - n);
			System.out.println("le " + combattant1.getClass().getSimpleName() + " a fait perdre " + n + " au "
					+ combattant2.getClass().getSimpleName());
			System.out.println(
					combattant1.getClass().getSimpleName() + ": " + combattant1.getPointsDeVie() + " PV restants");
			System.out.println(
					combattant2.getClass().getSimpleName() + ": " + combattant2.getPointsDeVie() + " PV restants");

		} else {
			System.out.println("vous avez frappé avec la même force");
			System.out.println("rien ne se passe");
		}

		if (combattant1.getPointsDeVie() <= 0) {
			System.out.println("le " + combattant1.getClass().getSimpleName() + " est mort");
		} else if (combattant2.getPointsDeVie() <= 0) {
			System.out.println("le " + combattant2.getClass().getSimpleName() + " est mort");
		} else {
			System.out.println("bug");
		}

	}
}
