package fr.diginamic.TP6;

import fr.diginamic.TP5.entites.Chambre;
import fr.diginamic.TP5.entites.Piece;
import fr.diginamic.TP5.entites.Salon;
import fr.diginamic.TP5.entites.WC;

public class TestAffichageSurface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chambre chambre1 = new Chambre(5, 12.3);
		Chambre chambre2 = new Chambre(3, 42.3);
		WC wc = new WC(1, 6.0);
		Salon salon1 = new Salon(1, 23.6);
		Maison maison = new Maison(new Piece[] { chambre1, chambre2, wc, salon1 });

		Rectangle rectangle = new Rectangle(5, 10);

		AffichageSurface affichageSurface = new AffichageSurface();
		System.out.println(affichageSurface.afficher(rectangle));
		System.out.println(affichageSurface.afficher(maison));
	}

}
