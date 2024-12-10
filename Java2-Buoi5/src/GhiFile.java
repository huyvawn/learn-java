import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class GhiFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("F:\\example.txt");
		try {
			FileOutputStream output = new FileOutputStream(file,false);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Ghi 1 byte du lieu
		try {
			FileOutputStream output = new FileOutputStream(file,true);
			output.write(66);
			System.out.println("Ghi file thanh cong.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Ghi 1 mang du lieu
		try {
			FileOutputStream output = new FileOutputStream(file,true);
			String text = "Hello abcxycz";
			byte buff[] = text.getBytes();
			output.write(buff, 0 , buff.length);
			System.out.println("Ghi file thanh cong.");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
//		Dong ket noi
		try {
			FileOutputStream output = new FileOutputStream(file,true);
			output.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
