package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cercle cercle1 = new Cercle(12.3);
		Cercle cercle2 = new Cercle(43.36);

		System.out.println("le périmetre de cercle1 est " + cercle1.getPerimetre());
		System.out.println("le périmetre de cercle2 est " + cercle2.getPerimetre());

		System.out.println("la surface de cercle1 est " + cercle1.getSurface());
		System.out.println("la surface de cercle2 est " + cercle2.getSurface());

		CercleFactory.creerCercle(56.1);

	}

}
