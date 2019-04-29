package fr.diginamic.TP7.listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import fr.diginamic.TP5.entites.Piece;

public class Maison {
	private List<Piece> listeDePieces = new ArrayList<>();

	public Maison() {
	}

	public void ajouterPiece(Piece piece) {

		listeDePieces.add(piece);

	}

	public void addAll(List<Piece> listeDeTrucs) {
		listeDePieces.addAll(listeDeTrucs);
	}

	public double calculerSuperficieTotaleMaison() {

		double somme = 0;
		int n = 0;
		Iterator<Piece> iterator = listeDePieces.iterator();
		while (iterator.hasNext()) {
			Piece myPiece = iterator.next();
			System.out.println(myPiece.getClass().getSimpleName() + ": ");
			System.out.println(myPiece.getSuperficie());
			System.out.println(myPiece.getEtage());
			somme = somme + myPiece.getSuperficie();
			n = n + 1;
		}
		return somme;

	}

	public double calculerSuperficieEtageMaison(int etage) {
		double somme = 0;
		int n = 0;
		System.out.println("");

		Iterator<Piece> iterator = listeDePieces.iterator();
		System.out.println("voila les superficies des différentes pieces de l'étage " + etage);
		while (iterator.hasNext()) {
			Piece myPiece = iterator.next();

			if (myPiece.getEtage() == etage) {
				System.out.println(myPiece.getClass().getSimpleName() + ": ");
				System.out.println(myPiece.getSuperficie());
				System.out.println(myPiece.getEtage());
				somme = somme + myPiece.getSuperficie();
				n = n + 1;
			}
		}
		if (n == 0) {
			System.out.println("et non, il n'y a aucune pièce à cet étage!");

			return somme;

		} else {
			return somme / n;
		}
	}

	public double calculerSuperficieDeCeTypeDePiece(String typeDePiece) {

		double somme = 0;
		int n = 0;

		System.out.println("");

		Iterator<Piece> iterator = listeDePieces.iterator();
		System.out.println("voila les superficies des différentes pieces de ce type " + typeDePiece);
		while (iterator.hasNext()) {
			Piece myPiece = iterator.next();

			if (myPiece.getClass().getSimpleName().equals(typeDePiece)) {
				System.out.println(myPiece.getClass().getSimpleName() + ": ");
				System.out.println(myPiece.getSuperficie());
				System.out.println(myPiece.getEtage());
				somme = somme + myPiece.getSuperficie();
				n = n + 1;
			}

		}
		if (n == 0) {
			System.out.println("et non, il n'y a aucune pièce de ce type!");

			return somme;

		} else {
			return somme;
		}

	}

	public int calculerNombreDePieceDeCeType(String typeDePiece) {

		int n = 0;

		System.out.println("");

		Iterator<Piece> iterator = listeDePieces.iterator();
		System.out.println("voila les pieces de ce type " + typeDePiece);
		while (iterator.hasNext()) {
			Piece myPiece = iterator.next();

			if (myPiece.getClass().getSimpleName().equals(typeDePiece)) {
				System.out.println(myPiece.getClass().getSimpleName() + ": ");
				System.out.println(myPiece.getSuperficie());
				System.out.println(myPiece.getEtage());
				n = n + 1;
			}

		}
		if (n == 0) {
			System.out.println("et non, il n'y a aucune pièce de ce type!");

			return n;

		} else {
			return n;
		}

	}

}
