package fr.diginamic.utils;

public class TriTableau {

	public int[] tri(int[] tab) {

		int[] array2 = tab;
		boolean enCoursDeTri = true;
		int n;

		while (enCoursDeTri == true) {
			enCoursDeTri = false;

			for (int i = 0; i < array2.length - 1; i++) {

				if (array2[i] > array2[i + 1]) {
					n = array2[i];
					array2[i] = array2[i + 1];
					array2[i + 1] = n;
					enCoursDeTri = true;
				}
			}

		}

		return array2;

	}
}
