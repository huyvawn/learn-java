import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DocFileObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream input1 = new FileInputStream("F:\\person.dat");
			ObjectInputStream input2 = new ObjectInputStream(input1);
			Person person = (Person) input2.readObject();
			System.out.println("Du lieu doc duoc la: " + person);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
