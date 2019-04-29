package fr.diginamic.TP7.listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ville {
	private String nom;
	private int nbHabitants;

	public Ville(String nom, int nbHabitants) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}

	public static void main(String[] args) {
		List<Ville> listeVille = new ArrayList<>();
		int indexVilleLaPlusPeuplee = 0;
		int indexVilleLaMoinsPeuplee = 0;

		listeVille.addAll(Arrays.asList(new Ville("Nice", 343000), new Ville("Carcassonne", 47800),
				new Ville("Narbonne", 53400), new Ville("Lyon", 484000), new Ville("Foix", 9700),
				new Ville("Pau", 77200), new Ville("Marseille", 850700), new Ville("Tarbes", 40600)));

		for (int i = 0; i < listeVille.size(); i++) {
			Ville monString = listeVille.get(i);

			if (monString.getNbHabitants() > listeVille.get(indexVilleLaPlusPeuplee).getNbHabitants()) {
				indexVilleLaPlusPeuplee = i;
			}
			if (monString.getNbHabitants() < listeVille.get(indexVilleLaMoinsPeuplee).getNbHabitants()) {
				indexVilleLaMoinsPeuplee = i;
			}
			if (monString.getNbHabitants() > 100000) {
				monString.setNom(monString.getNom().toUpperCase());
			}

		}
		System.out.println("la ville la plus peuplée est: " + listeVille.get(indexVilleLaPlusPeuplee).getNom()
				+ " placé à l'index: " + indexVilleLaPlusPeuplee);
		System.out.println("la ville la moins peuplée est: " + listeVille.get(indexVilleLaMoinsPeuplee).getNom()
				+ " placé à l'index: " + indexVilleLaMoinsPeuplee + ". Cette valeur est supprimée");
		listeVille.remove(indexVilleLaMoinsPeuplee);
		System.out.println("Les villes de plus de cent mille habitants ont été mises en majuscules");

		System.out.println("Voici la nouvelle liste:");
		Iterator<Ville> iterator = listeVille.iterator();
		while (iterator.hasNext()) {
			Ville myString = iterator.next();
			System.out.println(myString.getNom() + " " + myString.getNbHabitants());

		}

	}

	public int getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
