package dailypractise;
class Sheela 
{
	public void dance()
	{
		System.out.println("bharatnatyam");
	}
}
class Leela extends Sheela
{
	public void dance()
	{
		System.out.println("Salsa");
	}
}
public class MethOverriding {
	public static void main(String[] args) {
		Sheela s = new Leela();
		Leela l = (Leela)s;
		l.dance();
	}
}
