import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DocGhiBuffered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "F:\\example.txt";
		 
		try {
			BufferedInputStream input = new BufferedInputStream(new FileInputStream(filePath)); 
			int data;
			while((data = input.read()) != -1) {
				System.out.println((char) data);
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
//		Ghi du lieu
		try {
			BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(filePath));
			String text = "abc xyz";
			output.write(text.getBytes());
			output.flush();
			System.out.println("Du lieu duoc ghi thanh cong.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
