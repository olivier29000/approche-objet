package fr.diginamic.operations;

public class CalculMoyenne {
	public double[] attributs;

	public CalculMoyenne(int tailleTableau) {
		if (tailleTableau < 0) {
			tailleTableau = -tailleTableau;
		}
		attributs = new double[tailleTableau];
	}

	public void ajout(double nb, int index) {
		if (index >= attributs.length) {
			System.out.println("vous essayez de mettre trop d'éléments dans le tableau");
		} else {
			attributs[index] = nb;
		}

	}

	public double moyenneDesElements() {
		double somme = 0;
		for (int i = 0; i < attributs.length; i++) {
			somme = somme + attributs[i];
		}
		return somme / attributs.length;

	}

	public double[] getElements() {

		return attributs;

	}
}
