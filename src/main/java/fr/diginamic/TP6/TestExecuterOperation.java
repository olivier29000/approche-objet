package fr.diginamic.TP6;

public class TestExecuterOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecuterOperation executerOperation = new ExecuterOperation();
		System.out.println(executerOperation.execute(new Addition(), 5, 3));
		System.out.println(executerOperation.execute(new Multiplication(), 5, 3));

	}

}
