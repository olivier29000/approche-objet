package fr.diginamic.TP7.listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {

		List<Integer> listeEntiers = new ArrayList<>();
		int indexDeElementMax = 0;
		int indexDeElementMin = 0;

		listeEntiers.add(-1);
		listeEntiers.add(5);
		listeEntiers.add(7);
		listeEntiers.add(3);

		listeEntiers.addAll(Arrays.asList(-2, 4, 8, 5));

		for (int i = 0; i < listeEntiers.size(); i++) {
			Integer entier = listeEntiers.get(i);
			System.out.println(entier);
			if (entier > listeEntiers.get(indexDeElementMax)) {
				indexDeElementMax = i;
			}
			if (entier < listeEntiers.get(indexDeElementMin)) {
				indexDeElementMin = i;
			}
		}

		System.out.println("l'élément le plus grand est: " + listeEntiers.get(indexDeElementMax) + " placé à l'index: "
				+ indexDeElementMax);
		System.out.println("l'élément le plus petit était: " + listeEntiers.get(indexDeElementMin)
				+ " placé à l'index: " + indexDeElementMin + "... il a été supprimé");

		listeEntiers.remove(listeEntiers.get(indexDeElementMin));

		for (int i = 0; i < listeEntiers.size(); i++) {
			Integer monEntier = listeEntiers.get(i);

			if (monEntier < 0) {
				listeEntiers.set(i, -monEntier);
			}
		}

		System.out.println(listeEntiers);
	}
}
