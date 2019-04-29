package sets;

import java.util.Arrays;
import java.util.HashSet;

public class TestSetString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<>();
		set.addAll(Arrays.asList("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));

		System.out.println(set);
		String nMax = "";
		for (String pays : set) {
			if (pays.length() > nMax.length()) {
				nMax = pays;
			}
		}
		System.out.println(nMax);
	}

}
