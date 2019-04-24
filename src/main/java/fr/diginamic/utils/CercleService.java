package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleService {

	public static Cercle doubleCercle(Cercle c) {
		c.setRayonDuCercle(c.getRayonDuCercle() * 2);

		return c;
	}
}
