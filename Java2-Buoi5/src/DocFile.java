import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DocFile {
public static void main(String[] args) {
//	FileInputStream
//	BufferedInputStream
//	ObjectInputStream
//	F:\\example.txt
	File file = new File("F:\\example.txt");
	try {
		FileInputStream input = new FileInputStream(file);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
//	byte
//	Doc 1 byte du lieu
	
	try {
		FileInputStream input;
		input = new FileInputStream(file);
		int data = input.read();
		System.out.println(data);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
//	Doc tat ca byte du lieu
	try {
		FileInputStream input = new FileInputStream(file);
		int data = input.read();
		while (data > -1) {
			System.out.println(data);
			data = input.read();
		}
	} catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
//	Doc du lieu theo mang byte
	try {
		FileInputStream input = new FileInputStream(file);
		byte buff[] = new byte[1024];
		int length = input.read(buff);
		while (length > 0) {
			String text = new String(buff, 0, length);
			System.out.println(text);
			length = input.read(buff);
		}
	} catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
//	Dong file
	try {
		FileInputStream input = new FileInputStream(file);
		input.close();
	} catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
