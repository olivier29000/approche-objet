package fr.diginamic.TP6;

public class ExecuterOperation {

	public int execute(IOperation typeOperation, int nb1, int nb2) {
		return typeOperation.calcul(nb1, nb2);
	}
}
