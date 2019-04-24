package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculMoyenne calc = new CalculMoyenne(2);

		calc.ajout(5, 0);
		calc.ajout(15, 1);
		calc.ajout(45, 2);

		System.out.println(calc.moyenneDesElements());

		double[] array = calc.getElements();

		for (double truc : array) {
			System.out.println(truc);
		}
	}

}
