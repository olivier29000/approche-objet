package fr.diginamic.TP7.listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestListeString {

	public static void main(String[] args) {
		List<String> listeString = new ArrayList<>();
		int indexDeElementMax = 0;

		listeString
				.addAll(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));

		for (int i = 0; i < listeString.size(); i++) {
			String string = listeString.get(i);
			System.out.println(string);
			if (string.length() > listeString.get(indexDeElementMax).length()) {
				indexDeElementMax = i;
			}

		}

		System.out.println("l'élément le plus grand est: " + listeString.get(indexDeElementMax) + " placé à l'index: "
				+ indexDeElementMax);

		for (int i = 0; i < listeString.size(); i++) {
			String monString = listeString.get(i);

			listeString.set(i, monString.toUpperCase());

		}

		Iterator<String> iterator = listeString.iterator();
		while (iterator.hasNext()) {
			String myString = iterator.next();
			if (myString.charAt(0) == 'N') {
				iterator.remove();
			}

		}

		System.out.println("Voici la nouvelle liste: " + listeString);
	}
}
