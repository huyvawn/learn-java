import java.io.File;
import java.io.IOException;

public class ThaoTacFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("F:\\example.txt");
		System.out.println("Duong dan file: " + file.getPath());
		// Kiem tra xem file co ton tai khong.
		if(file.exists()) {
			System.out.println("File co ton tai.");
		}
		else {
			System.out.println("File khong ton tai.");
		}
		//Tao 1 file moi
		File createFile = new File("F:\\example1.txt");
		try {
			if(createFile.createNewFile()) {
				System.out.println("Tao file thanh cong.");
			}
			else {
				System.out.println("Tao file khong thanh cong.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Tao 1 thu muc moi
		File folder = new File("F:\\folder");
		if (folder.mkdir()) {
			System.out.println("Tao thu muc thanh cong.");
		}
		else {
			System.out.println("Tao thu muc khong thanh cong.");
		}
		
		//Xoa file
		if (createFile.delete()) {
			System.out.println("Xoa file thanh cong.");
		}
		else {
			System.out.println("Xoa file khong thanh cong.");
		}
		
		//Doi ten file
		File oldFile = new File("F:\\example.txt");
		File newFile = new File("F:\\example_new.txt");
		if (oldFile.renameTo(newFile)) {
			System.out.println("Doi ten thanh cong.");
		}
		else {
			System.out.println("Doi ten khong thanh cong.");
		}
		
		//length()
		//isFile()
		//isDirectory()
//			getName()
		
	}

}
