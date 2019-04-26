package fr.diginamic.TP5.essais;

import fr.diginamic.TP5.entites.Pigiste;
import fr.diginamic.TP5.entites.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salarie salarie = new Salarie("olivier", "lasbleis", 2145);
		salarie.afficheDonnees();

		Pigiste pigiste = new Pigiste("thomas", "lepape", 22, 265);
		pigiste.afficheDonnees();
	}

}
