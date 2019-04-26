package fr.diginamic.TP6;

/**
 * Cette interface impose une signature à toute classe souhaitant effectuée une
 * opération sur 2 entiers
 *
 * @author DIGINAMIC
 *
 */
public interface IOperation {
	/**
	 * Cette méthode effectue un calcul sur 2 entiers et retourne un résultat
	 *
	 * @param a
	 *            entier
	 * @param b
	 *            entier
	 * @return int
	 */
	int calcul(int a, int b);
}
