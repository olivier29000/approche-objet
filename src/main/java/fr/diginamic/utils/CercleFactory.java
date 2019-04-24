package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleFactory {

	public static Cercle creerCercle(double rayon) {
		Cercle cercle1 = new Cercle(rayon);
		return cercle1;
	}
}
