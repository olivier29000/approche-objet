package fr.diginamic.TP6;

import fr.diginamic.TP5.entites.Piece;

public class Maison implements ISurface {
	private Piece[] tableauDePieces;

	public Maison(Piece[] tableauDePieces) {
		this.tableauDePieces = tableauDePieces;
	}

	public void ajouterPiece(Piece piece) {

		Piece[] tabUtile = new Piece[tableauDePieces.length + 1];
		if (tableauDePieces.length != 0) {
			for (int i = 0; i < tableauDePieces.length; i++) {
				tabUtile[i] = tableauDePieces[i];
			}
			tabUtile[tableauDePieces.length] = piece;
		} else {
			tabUtile[0] = piece;
		}
		tableauDePieces = tabUtile;
		// System.out.println("Vous avez stocké le chiffre " + nbAStocker);
	}

	@Override
	public double calculerSurface() {
		double somme = 0;
		System.out.println("");
		if (tableauDePieces.length != 0) {
			System.out.println("voila les superficies des différentes pieces");
			for (int i = 0; i < tableauDePieces.length; i++) {
				System.out.print(tableauDePieces[i].getClass().getSimpleName() + ": ");
				System.out.print(tableauDePieces[i].getSuperficie() + ", ");
				somme = somme + tableauDePieces[i].getSuperficie();
			}
			System.out.println("");
			return somme;
		} else {
			System.out.println("Il n'y a aucune pièce dans ta maison");
			return 0;
		}

	}

	public double calculerSuperficieEtageMaison(int etage) {
		double somme = 0;
		int n = 0;
		System.out.println("");
		if (tableauDePieces.length != 0) {
			System.out.println("voila les superficies des différentes pieces de l'étage " + etage);

			for (int i = 0; i < tableauDePieces.length; i++) {
				if (tableauDePieces[i].getEtage() == etage) {
					System.out.print(
							tableauDePieces[i].getClass().getSimpleName() + ": " + tableauDePieces[i].getEtage() + "-");
					System.out.print(tableauDePieces[i].getSuperficie() + ", ");
					somme = somme + tableauDePieces[i].getSuperficie();
					System.out.println(n);
					n++;
				}

			}
			if (n == 0) {
				System.out.println("et non, il n'y a aucune pièce à cet étage!");

				return somme;

			} else {

				return somme;
			}

		} else {
			System.out.println("Il n'y a aucune pièce dans ta maison");
			return 0;
		}

	}

	public double calculerSuperficieDeCeTypeDePiece(String typeDePiece) {

		double somme = 0;
		int n = 0;

		System.out.println("");

		if (tableauDePieces.length != 0) {
			System.out.println("voila les superficies des différentes pieces de ce type " + typeDePiece);

			for (int i = 0; i < tableauDePieces.length; i++) {
				if (tableauDePieces[i].getClass().getSimpleName().equals(typeDePiece)) {
					System.out.print(
							tableauDePieces[i].getClass().getSimpleName() + ": " + tableauDePieces[i].getEtage() + "-");
					System.out.print(tableauDePieces[i].getSuperficie() + ", ");
					somme = somme + tableauDePieces[i].getSuperficie();
					System.out.println(n);
					n++;
				}

			}
			if (n == 0) {
				System.out.println("et non, il n'y a aucune pièce de ce type!");

				return somme;

			} else {

				return somme;
			}

		} else {
			System.out.println("Il n'y a aucune pièce dans ta maison");
			return 0;
		}

	}

	public int calculerNombreDePieceDeCeType(String typeDePiece) {

		int n = 0;

		System.out.println("");

		if (tableauDePieces.length != 0) {
			System.out.println("voila les pieces de ce type " + typeDePiece);

			for (int i = 0; i < tableauDePieces.length; i++) {
				if (tableauDePieces[i].getClass().getSimpleName().equals(typeDePiece)) {
					System.out.print(
							tableauDePieces[i].getClass().getSimpleName() + ": " + tableauDePieces[i].getEtage() + "-");
					System.out.println(tableauDePieces[i].getSuperficie() + ", ");

					n++;
				}

			}
			if (n == 0) {
				System.out.println("et non, il n'y a aucune pièce de ce type!");

				return n;

			} else {
				System.out.println("il y a " + n + " " + typeDePiece);
				return n;
			}

		} else {
			System.out.println("Il n'y a aucune pièce dans ta maison");
			return 0;
		}

	}

	public Piece[] getTableauDePieces() {
		return tableauDePieces;
	}

	public void setTableauDePieces(Piece[] tableauDePieces) {
		this.tableauDePieces = tableauDePieces;
	}

}
