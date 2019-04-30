package tri.essais;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import tri.ComparatorHabitant;
import tri.ComparatorPibHabitant;
import tri.Pays;

public class TestExercice3 {

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

		List<Pays> listePays = new ArrayList<>();

		listePays.addAll(Arrays.asList(usa, france, allemagne, uk, italie, japon, chine, russie, inde));

		for (int i = 0; i < listePays.size(); i++) {
			System.out.println(listePays.get(i).getNom());
		}
		System.out.println("--------------------TRI AVEC COMPARATOR----------------");
		System.out.println("--------------------SELON NB HABITANTS----------------");
		listePays.sort(new ComparatorHabitant());

		for (int i = 0; i < listePays.size(); i++) {
			System.out.println(listePays.get(i).getNom());
		}

		listePays.sort(new ComparatorPibHabitant());
		System.out.println("--------------------SELON PIB/HABITANTS----------------");
		for (int i = 0; i < listePays.size(); i++) {
			System.out.println(listePays.get(i).getNom());
		}
	}

}
