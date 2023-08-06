package stringclass;

public class String1 {

	private String name;

	public String getName() {
		return name;
	}

	public String1 setName(String name) {
		if (this.name == name) {
			return this;
		} else
			return new String1(name);
	}

	String1() {
	}

	String1(String name) {
		this.name = name;
	}

}
