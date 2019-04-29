package fr.diginamic.TP7.listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CalculMoyenne {

	public List<Double> listeDeDouble = new ArrayList<>();

	public void ajout(double nb) {
		listeDeDouble.add(nb);
	}

	public double moyenneDesElements() {
		double somme = 0;
		int n = 0;
		Iterator<Double> iterator = listeDeDouble.iterator();
		while (iterator.hasNext()) {
			Double myUser = iterator.next();
			somme = somme + myUser;
			n = n + 1;
		}
		return somme / n;
	}

	public List<Double> getListeDeDouble() {
		return listeDeDouble;
	}

	public void setListeDeDouble(List<Double> listeDeDouble) {
		this.listeDeDouble = listeDeDouble;
	}

}
