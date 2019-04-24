package fr.diginamic.essais;

import fr.diginamic.utils.TriTableau;

public class TestTriTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TriTableau tab = new TriTableau();

		int[] array = tab.tri(new int[] { 3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -48, 84 });

		for (double truc : array) {
			System.out.println(truc);
		}

	}

}
