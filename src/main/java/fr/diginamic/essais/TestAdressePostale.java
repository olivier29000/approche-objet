package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale adresseDeToto = new AdressePostale();
		adresseDeToto.numeroRue = 5;
		adresseDeToto.libelleRue = "de la rue de toto";
		adresseDeToto.codePostal = 44100;
		adresseDeToto.ville = "TotoVille";
		
		
		AdressePostale adresseDeMonsieurBulle = new AdressePostale();
		adresseDeMonsieurBulle.numeroRue = 85;
		adresseDeMonsieurBulle.libelleRue = "du traoré de Monsieur Bulle";
		adresseDeMonsieurBulle.codePostal = 35700;
		adresseDeMonsieurBulle.ville = "BubuleVille";
		
		System.out.println(adresseDeToto);
	}

}
