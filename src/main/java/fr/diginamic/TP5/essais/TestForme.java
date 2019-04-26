package fr.diginamic.TP5.essais;

import fr.diginamic.TP5.entites.Carre;
import fr.diginamic.TP5.entites.Cercle;
import fr.diginamic.TP5.entites.Rectangle;

public class TestForme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle(5, 10);
		AffichageForme num1 = new AffichageForme();
		num1.afficher(rectangle);

		Cercle cercle = new Cercle(5);
		AffichageForme num2 = new AffichageForme();
		num2.afficher(cercle);

		Carre carre = new Carre(15);
		AffichageForme num3 = new AffichageForme();
		num3.afficher(carre);

	}

}
