package comparable;

import java.util.Comparator;

public class SortByHeight implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Human h1 = (Human) o1;
		Human h2 = (Human) o1;
		if (h1.Height > h2.Height)
			return 1;
		else if (h1.Height > h2.Height)
			return -1;
		else
			return 0;
	}

}
