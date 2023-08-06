package equals;
class State
{
	int a;
	State(int a)
	{
		this.a = a;
	}
	public boolean equals(Object obj)
	{
		State temp = (State)obj;
		return this.a == temp.a;
		
	}
}
public class StateCompare {

	public static void main(String[] args) {
		State s = new State(10);
		State s1 = new State(10);
		System.out.println(s.equals(s1));
		
	}
}
