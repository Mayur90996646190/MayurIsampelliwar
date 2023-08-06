package programmingclass;
//design the blueprint of student object with the states student id student name
// and one display method to display the details of student
// Create a container to store 5 student objects in it display details of all the student

class Student {
	int id;
	String name;
	Student(){}
	Student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	public void display()
	{	System.out.println("Details of Students ");
		System.out.println(id + " is id of Student ");
		System.out.println(name  + " is name of Student ");
		System.err.println("****************************");
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
public class DetailsOfStudent{
	public static void main(String[] args) {
		Student[] a = new Student[5];
		a[0] = new Student(101,"smith");
		a[1] = new Student(102,"adam");
		a[2] = new Student(103,"devid");
		a[3] = new Student(104,"miller");
		a[4] = new Student(105,"john");
		Student s = new Student();
		a[0].display();
		a[1].display();
		a[2].display();
		a[3].display();
		a[4].display();
		
	}
}

	
