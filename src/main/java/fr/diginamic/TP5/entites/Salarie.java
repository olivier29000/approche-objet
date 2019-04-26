package fr.diginamic.TP5.entites;

public class Salarie extends Intervenant {

	private double salaire;

	public Salarie(String nom, String prenom, double salaire) {
		super(nom, prenom);
		this.salaire = salaire;
		System.out.println("vous venez de créer un salarié avec le salaire mensuel de " + salaire);
	}

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return salaire;
	}

	@Override
	public String getStatut() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName();
	}

}
