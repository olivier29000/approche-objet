package tri;

import java.util.Comparator;

public class ComparatorPibHabitant implements Comparator<Pays> {
	public int compare(Pays arg0, Pays arg1) {
		if (arg0.getPibParHabitant() > arg1.getPibParHabitant()) {
			return 1;
		} else if (arg0.getPibParHabitant() < arg1.getPibParHabitant()) {
			return -1;
		} else {
			return 0;
		}
	}
}
