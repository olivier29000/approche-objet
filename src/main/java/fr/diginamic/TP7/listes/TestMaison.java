package fr.diginamic.TP7.listes;

import java.util.Arrays;

import fr.diginamic.TP5.entites.Chambre;
import fr.diginamic.TP5.entites.Salon;
import fr.diginamic.TP5.entites.WC;

public class TestMaison {
	public static void main(String[] args) {
		Chambre chambre1 = new Chambre(5, 12.3);
		Chambre chambre2 = new Chambre(3, 42.3);
		WC wc = new WC(1, 6.0);
		Salon salon1 = new Salon(1, 23.6);
		Maison maison = new Maison();
		maison.addAll(Arrays.asList(chambre1, chambre2, wc));
		maison.ajouterPiece(salon1);

		System.out.println("/////////////////");
		System.out.println("superficie: " + maison.calculerSuperficieTotaleMaison());
		System.out.println("/////////////////");
		Salon salon2 = new Salon(1, 23.6);
		maison.ajouterPiece(salon2);
		System.out.println("/////////////////");
		System.out.println("superficie: " + maison.calculerSuperficieTotaleMaison());
		System.out.println("/////////////////");
		System.out.println("superficie: " + maison.calculerSuperficieEtageMaison(5));
		System.out.println("/////////////////");
		System.out.println("superficie: " + maison.calculerSuperficieDeCeTypeDePiece("Chambre"));
		System.out.println("/////////////////");
		System.out.println("il y a " + maison.calculerNombreDePieceDeCeType("Chambre") + " pieces de ce type");

	}
}
