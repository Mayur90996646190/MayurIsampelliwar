package filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmpDriver1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String path = "K:\\\\Eclipse\\\\QACA6\\\\filehandling\\\\EmpDriver.text";
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj =ois.readObject();
		Employee e =(Employee) obj;
		System.out.println(e.eid);
		System.out.println(e.name);
		System.out.println(e.sal);
	}
}
