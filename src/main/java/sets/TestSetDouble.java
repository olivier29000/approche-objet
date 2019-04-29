package sets;

import java.util.Arrays;
import java.util.HashSet;

public class TestSetDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Double> set = new HashSet<>();
		set.addAll(Arrays.asList(1.5, 8.25, -7.32, 113.3, -12.45, 48.5, 0.01, 13.3));

		System.out.println(set);
		double nMax = Double.MIN_VALUE;
		for (Double double1 : set) {
			if (double1 > nMax) {
				nMax = double1;
			}
		}
		System.out.println(nMax);
	}

}
