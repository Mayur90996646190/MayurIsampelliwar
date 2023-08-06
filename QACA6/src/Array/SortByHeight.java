package Array;

import java.util.Comparator;

public class SortByHeight implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		Human h1 = (Human)o1;
		Human h2 = (Human)o2;
		if(h1.height>h2.height)
			return 1;
		else if(h1.height<h2.height)
			return -1;
		else
			return 0;
	}
	
}
