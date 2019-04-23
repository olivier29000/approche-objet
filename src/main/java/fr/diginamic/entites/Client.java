package fr.diginamic.entites;

public class Client {

		public int numeroCompte;
		public String nom ;
		public String prenom ;
		
		
		public Client(int paramNumeroCompte,String paramNom,String paramPrenom){
			numeroCompte=paramNumeroCompte;
			nom=paramNom;
			prenom=paramPrenom;
			System.out.println("Nouvelle instance créée avec les caracteristiques");
			System.out.println("Numero de compte: " + numeroCompte);
			System.out.println("Nom: " + paramNom);
			System.out.println("Prenom: " + paramPrenom);
			
		}
}
