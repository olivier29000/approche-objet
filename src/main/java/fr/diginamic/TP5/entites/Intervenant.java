package fr.diginamic.TP5.entites;

public abstract class Intervenant {
	private String nom;
	private String prenom;

	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public abstract double getSalaire();

	public abstract String getStatut();

	public void afficheDonnees() {
		System.out.println(nom + " " + prenom);
		System.out.println(getSalaire());
		System.out.println(getStatut());
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
