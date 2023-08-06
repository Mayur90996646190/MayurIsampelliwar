package Array;

import java.util.Comparator;

public class SortByName implements Comparator{
	public int compare(Object o1,Object o2)
	{
		Human h1= (Human)o1;
		Human h2 = (Human)o2;
		return h1.name.compareTo(h2.name);
	}
}
