package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;

public class TestAttributClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale a = new AdressePostale(5, "de la rue de toto", 44100, "TotoVille");
		AdressePostale b = new AdressePostale(6, "de la rue du copain de toto", 44100, "TotoVille");
		AdressePostale.nbDepartements = 102;
		System.out.println(a.nbDepartements);
		System.out.println(b.nbDepartements);
		System.out.println(AdressePostale.nbDepartements);

	}

}
