package fr.diginamic.TP5.jeuderole.essais;

import java.util.Scanner;

import fr.diginamic.TP5.jeuderole.entites.Gobelin;
import fr.diginamic.TP5.jeuderole.entites.Loup;
import fr.diginamic.TP5.jeuderole.entites.Personnage;
import fr.diginamic.TP5.jeuderole.entites.Troll;

public class JeuDeRole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int phaseDeJeuChoisi = 1;

		Loup loup = new Loup();
		Gobelin gobelin = new Gobelin();
		Troll troll = new Troll();
		Personnage personnage = new Personnage();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println();
			System.out.println();

			System.out.println("Qui voulez vous combattre? :");
			System.out.println("1 : LOUP");
			System.out.println("2 : GOBELIN");
			System.out.println("3 : TROLL");
			int str = sc.nextInt();

			while (str == 1 && str == 2 && str == 3 && str == 4) {

				System.out.println("Qui voulez vous combattre? :");
				System.out.println("1 : LOUP");
				System.out.println("2 : GOBELIN");
				System.out.println("3 : TROLL");
				str = sc.nextInt();

			}
			if (str == 1) {
				System.out.println("Vous avez choisi de combattre le loup");
				while (loup.getPointsDeVie() > 0 && personnage.getPointsDeVie() > 0) {

					System.out.println("Que voulez vous faire? :");
					System.out.println("1 : TAPER");
					System.out.println("2 : PARRER");
					System.out.println("3 : FUITE TACTIQUE");
					str = sc.nextInt();
					if (str == 1) {
						Combat combat = new Combat(personnage, loup);
					} else if (str == 2) {
						System.out.println("tu parres");
						;
					} else if (str == 3) {
						Fuite fuite = new Fuite(personnage, loup);
						;
					}
				}
				if (loup.getPointsDeVie() < 0) {
					loup = new Loup();
				} else if (personnage.getPointsDeVie() < 0) {
					personnage = new Personnage();
				}

			}
			if (str == 2) {
				System.out.println("Vous avez choisi de combattre le gobelin");
				Combat combat = new Combat(personnage, gobelin);
				gobelin = new Gobelin();
			}
			if (str == 3) {
				System.out.println("Vous avez choisi de combattre le troll");
				Combat combat = new Combat(personnage, troll);
				troll = new Troll();
			}
		}
	}

}
