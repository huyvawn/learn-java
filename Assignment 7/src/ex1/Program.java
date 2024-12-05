package ex1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Program {
	static List<Student> studentlist = new ArrayList<Student>();
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student("Nguyen Van A");
		Student std2 = new Student("Nguyen Van A");
		Student std3 = new Student("Nguyen Van A");
		Student std4 = new Student("Nguyen Van B");
		Student std5 = new Student("Nguyen Van C");
		
		studentlist.add(std1);
		studentlist.add(std2);
		studentlist.add(std3);
//		for (Student student : studentlist) {
//			System.out.println(student);
//		}
		// a.	In ra tổng số phần tử của students
		System.out.println("Tong so phan tu students: "+ studentlist.size());
		
//		b)	Lấy phần tử thứ 4 của students
		try {
			System.out.println("Phan tu 4 students: "+ studentlist.get(3));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("INdex out of bound.");
		}
		
		
//		c)	In ra phần tử đầu và phần tử cuối của students
		System.out.println("Phan tu dau: "+ studentlist.get(0));
		System.out.println("Phan tu cuoi: "+ studentlist.get(studentlist.size() - 1));
		
//		d)	Thêm 1 phần tử vào vị trí đầu của students
		studentlist.add(0, std4);
		
//		e)	Thêm 1 phần tử vào vị trí cuối của students
		studentlist.add(studentlist.size(), std5);
		
//		f)	Đảo ngược vị trí của students
		List<Student> reversed = new ArrayList<Student>();
		for (int i = studentlist.size()-1; i >= 0; i--) {
			reversed.add(studentlist.get(i));
		}
		System.out.println();
		System.out.println("Dao nguoc phan tu students: ");
		for (Student student : reversed) {
			System.out.println(student);
		}
		
//		g)	Tạo 1 method tìm kiếm student theo id
//		findById();
		
//		h)	Tạo 1 method tìm kiếm student theo name
//		findByName();
		
//		i)	Tạo 1 method để in ra các student có trùng tên
		trungTen();
		
//		j)	Xóa name của student có id = 2;
		for (Student student : studentlist) {
			if (student.id == 2) {
				student.setName(null);
			}
		}
		System.out.println("J");
		
//		k)	Delete student có id = 5;
		for (Student student : studentlist) {
			if (student.id == 5) {
				studentlist.remove(student);
			}
		}
		System.out.println("K");
		
//		l)	Tạo 1 ArrayList tên là studentCopies và add tất cả students vào studentCopies
		List<Student> studentCopies = new ArrayList<Student>();
		for (Student student : studentlist) {
			studentCopies.add(student);
		}
		for (Student student : studentCopies) {
			System.out.println(student);
		}
		
	}
		static void findById() {
			System.out.println("Nhap id ban can tim: ");
			int id = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Ket qua tim kiem: ");
			for (Student student : studentlist) {
				if (student.id == id) {
					System.out.println(student);
					break;
				}
			}
		}
		
		 static void findByName() {
			 System.out.println("Nhap ten can tim: ");
			 String name = scanner.nextLine();
			 System.out.println("Ket qua tim: ");
			 for (Student student : studentlist) {
				if (student.getName().contains(name)) {
					System.out.println(student);
				}
			}
		 }
		
		 static void trungTen() {
			 System.out.println("Nhung nguoi trung ten: ");
			 for (int i = 0; i < studentlist.size(); i++) {
				for (int j = i+1; j <studentlist.size(); j++) {
					if (studentlist.get(i).getName().equals(studentlist.get(j).getName())) {
						studentlist.get(i).setTrungten();
						studentlist.get(j).setTrungten();
					}
				}
			}
			 for (Student student : studentlist) {
				if (student.trungten == true) {
					System.out.println(student);
				}
			}
		 }
		 
}
