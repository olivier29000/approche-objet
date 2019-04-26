package fr.diginamic.TP6;

/**
 * Cette interface représente conceptuellement n’importe quel objet pour lequel
 * il est possible de calculer une surface (ou superficie).
 *
 * @author DIGINAMIC
 *
 */

public interface ISurface {
	/**
	 * méthode calculerSurface qui retourne un double.
	 *
	 * @param a
	 *            double
	 * @param b
	 *            double
	 * @return double
	 */
	double calculerSurface();
}
