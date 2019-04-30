package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import sets.Pays;

public class TestMapPays {

	public static void main(String[] args) {

		Pays usa = new Pays("USA", 327167434, 55805);
		Pays france = new Pays("France", 67795000, 38476);
		Pays allemagne = new Pays("Allemagne", 82979100, 47589);
		Pays uk = new Pays("UK", 65105246, 43770);
		Pays italie = new Pays("Italie", 60483973, 29866);
		Pays japon = new Pays("Japon", 126330302, 39058);
		Pays chine = new Pays("Chine", 1417913092, 7989);
		Pays russie = new Pays("Russie", 146780700, 11099);
		Pays inde = new Pays("Inde", 1296834042, 1626);

		// TODO Auto-generated method stub
		Map<String, Pays> map = new HashMap<>();
		// association d'une clé à chaque élément
		map.put(usa.getNom(), usa);
		map.put(france.getNom(), france);
		map.put(allemagne.getNom(), allemagne);
		map.put(uk.getNom(), uk);
		map.put(italie.getNom(), italie);
		map.put(japon.getNom(), japon);
		map.put(chine.getNom(), chine);
		map.put(russie.getNom(), russie);
		map.put(inde.getNom(), inde);

		// récupération en fonction de la clé
		// User u1bis = map.get(new Integer(1));
		String cleDuPaysQuiLeMoinsHabitant = "";
		int nombreHabitantLePlusPetit = Integer.MAX_VALUE;

		Iterator<String> keysIte = map.keySet().iterator();
		while (keysIte.hasNext()) {
			String u = keysIte.next();
			System.out.println(u);
			if (map.get(u).getNbHabitants() < nombreHabitantLePlusPetit) {
				cleDuPaysQuiLeMoinsHabitant = u;
				nombreHabitantLePlusPetit = map.get(u).getNbHabitants();
			}

			// ...
		}

		Iterator<Pays> valuesIte = map.values().iterator();
		while (valuesIte.hasNext()) {
			Pays u = valuesIte.next();
			System.out.println(u.getNom() + " " + u.getNbHabitants() + " " + u.getPib());
			// ...
		}

		System.out.println("le pays qui a le moins d'habitants est " + map.get(cleDuPaysQuiLeMoinsHabitant).getNom()
				+ ", il est supprimé de la base de donnée");
		map.remove(cleDuPaysQuiLeMoinsHabitant);

		Iterator<Pays> valuesIte1 = map.values().iterator();
		while (valuesIte1.hasNext()) {
			Pays u = valuesIte1.next();
			System.out.println(u.getNom() + " " + u.getNbHabitants() + " " + u.getPib());
			// ...
		}
	}

}
