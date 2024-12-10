import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class GhiFileObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("Huy", 21);
		File file = new File("F:\\person.dat");
		try {
			FileOutputStream output1 = new FileOutputStream(file);
			ObjectOutputStream output2 = new ObjectOutputStream(output1);
			output2.writeObject(person);
			System.out.println("Da ghi file thanh cong.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
