package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;
import fr.diginamic.entites.Personne;
import fr.diginamic.essais.TestAdressePostale;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdressePostale adresseDeToto = new AdressePostale();
		adresseDeToto.numeroRue = 5;
		adresseDeToto.libelleRue = "de la rue de toto";
		adresseDeToto.codePostal = 44100;
		adresseDeToto.ville = "TotoVille";
		
		
		Personne toto = new Personne();
		toto.nom="Thomas";
		toto.prenom="Charpentier";
		toto.adressePostale=adresseDeToto;
		
				
		Personne monsieurBulle = new Personne();
		monsieurBulle.nom="Thomas";
		monsieurBulle.prenom="Charpentier";
		monsieurBulle.adressePostale=new AdressePostale();
		monsieurBulle.adressePostale.ville="Nantes";
		monsieurBulle.adressePostale.numeroRue=42;
		monsieurBulle.adressePostale.libelleRue="les mimosas";
		monsieurBulle.adressePostale.codePostal=42360;
		
	
	}

}
