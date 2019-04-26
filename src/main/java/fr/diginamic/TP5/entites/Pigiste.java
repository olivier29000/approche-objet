package fr.diginamic.TP5.entites;

public class Pigiste extends Intervenant {

	private int nbJoursTravaille;
	private double salaireJournalier;

	public Pigiste(String nom, String prenom, int nbJoursTravaille, double salaireJournalier) {
		// TODO Auto-generated constructor stub
		super(nom, prenom);
		this.nbJoursTravaille = nbJoursTravaille;
		this.salaireJournalier = salaireJournalier;
		System.out.println("vous venez de créer un pigiste");
	}

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return nbJoursTravaille * salaireJournalier;
	}

	@Override
	public String getStatut() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName();
	}

}
