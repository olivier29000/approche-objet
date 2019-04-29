package sets;

import java.util.Arrays;
import java.util.HashSet;

public class Pays {

	private String nom;
	private int nbHabitants;
	private int pibParHabitant;

	public Pays(String nom, int nbHabitants, int pibParHabitant) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibParHabitant = pibParHabitant;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pays usa = new Pays("USA", 327167434, 55805);
		Pays france = new Pays("France", 67795000, 38476);
		Pays allemagne = new Pays("Allemagne", 82979100, 47589);
		Pays uk = new Pays("UK", 65105246, 43770);
		Pays italie = new Pays("Italie", 60483973, 29866);
		Pays japon = new Pays("Japon", 126330302, 39058);
		Pays chine = new Pays("Chine", 1417913092, 7989);
		Pays russie = new Pays("Russie", 146780700, 11099);
		Pays inde = new Pays("Inde", 1296834042, 1626);

		HashSet<Pays> set = new HashSet<>();
		set.addAll(Arrays.asList(usa, france, allemagne, uk, italie, japon, chine, russie, inde));

		Pays paysPibParHabitantLePlusImportant = new Pays("", 0, 0);
		Pays paysPibTotalLePlusImportant = new Pays("", 0, 0);
		Pays paysPibTotalLePlusPetit = new Pays("", 0, Integer.MAX_VALUE);

		for (Pays pays : set) {
			if (pays.getPib() > paysPibParHabitantLePlusImportant.getPib()) {
				paysPibParHabitantLePlusImportant = pays;
			}
			if (pays.getPib() * pays.getNbHabitants() > paysPibTotalLePlusImportant.getPib()
					* paysPibParHabitantLePlusImportant.getNbHabitants()) {
				paysPibTotalLePlusImportant = pays;
			}
			if (pays.getPib() * pays.getNbHabitants() < paysPibTotalLePlusPetit.getPib()
					* paysPibTotalLePlusPetit.getNbHabitants()) {
				paysPibTotalLePlusPetit = pays;
			}
			System.out.println(pays.getNom() + " " + pays.getNbHabitants() + " " + pays.getPib());

		}
		System.out.println(paysPibParHabitantLePlusImportant.getNom());
		System.out.println(paysPibTotalLePlusImportant.getNom());
		System.out.println(paysPibTotalLePlusPetit.getNom());

		Pays paysPibTotalLePlusPetitEnMajuscule = new Pays(paysPibTotalLePlusPetit.getNom().toUpperCase(),
				paysPibTotalLePlusPetit.getNbHabitants(), paysPibTotalLePlusPetit.getPib());

		set.remove(paysPibTotalLePlusPetit);
		set.add(paysPibTotalLePlusPetitEnMajuscule);

		for (Pays pays : set) {

			System.out.println(pays.getNom() + " " + pays.getNbHabitants() + " " + pays.getPib());

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

	public int getPib() {
		return pibParHabitant;
	}

	public void setPib(int pib) {
		this.pibParHabitant = pibParHabitant;
	}
}
