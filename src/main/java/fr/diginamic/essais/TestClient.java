package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;
import fr.diginamic.entites.Client;

public class TestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client monsieurPatate = new Client(1, "toto", "martin",
				new AdressePostale(42, "rue de la paix", 44500, "Trouville"));
		Client madameTomate = new Client(2, "citrouille", "thomas",
				new AdressePostale(42, "rue du frout", 92400, "Asniere"));

		System.out.println(madameTomate.retourneNom());
		System.out.println(madameTomate.retournePrenom());
		madameTomate.setNom("tata");
		madameTomate.setPrenom("coucou");
		System.out.println(madameTomate.retourneNom());
		System.out.println(madameTomate.retournePrenom());
	}

}
