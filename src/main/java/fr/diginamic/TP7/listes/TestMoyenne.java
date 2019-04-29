package fr.diginamic.TP7.listes;

public class TestMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculMoyenne listeDeValeur = new CalculMoyenne();
		listeDeValeur.ajout(5.3);
		listeDeValeur.ajout(9.6);
		listeDeValeur.ajout(2.1);
		System.out.println(listeDeValeur.moyenneDesElements());
		System.out.println(listeDeValeur.getListeDeDouble());
	}

}
