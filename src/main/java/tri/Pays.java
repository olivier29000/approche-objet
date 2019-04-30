package tri;

public class Pays implements Comparable<Pays> {
	private String nom;
	private int nbHabitants;
	private int pibParHabitant;

	public Pays(String nom, int nbHabitants, int pibParHabitant) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibParHabitant = pibParHabitant;
	}

	// public int compareTo(Pays user2) {
	// int result = this.nom.compareTo(user2.getNom());
	// return result;
	// }

	public int compareTo(Pays user2) {
		if (this.getPibParHabitant() > user2.getPibParHabitant()) {
			return 1;
		} else if (this.getPibParHabitant() < user2.getPibParHabitant()) {
			return -1;
		} else {
			return 0;
		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	public int getPibParHabitant() {
		return pibParHabitant;
	}

	public void setPibParHabitant(int pibParHabitant) {
		this.pibParHabitant = pibParHabitant;
	}
}
