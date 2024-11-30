package quanlysinhvien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			List<Student> liststudent = new ArrayList<Student>();
			Scanner scanner = new Scanner(System.in);
			while (true) {
			printMenu();
			System.out.println("Lua chon chuc nang:");
			try {
				int choice = scanner.nextInt();
//				scanner.nextLine();
				switch (choice) {
				case 1:
					themsinhvien(liststudent, scanner);
					break;
				case 2:
					hiensinhvien(liststudent);
					break;
				case 3:
					suasinhvien();
					break;
				case 4:
					xoasinhvien();
					break;
				case 5:
					System.out.println("Thoat chuong trinh.");
					return;
					
				default:
					System.out.println("Vui long nhap lai.");
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Phai nhap so");
			}
			
		}
	}

	public static void printMenu() {
		System.out.println("------- FUNCTIONS MENU------");
		System.out.println("1. Them sinh vien");
		System.out.println("2. Hien thi sinh vien");
		System.out.println("3. Sua sinh vien");
		System.out.println("4. Xoa sinh vien");
		System.out.println("5. Thoat chuong trinh");
	}
	
	public static void themsinhvien(List<Student> liststudent, Scanner scanner) {
		System.out.println("So sinh vien ban muon them: ");
		
		int times = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < times; i++) {
			System.out.println("Nhap id: ");
			int id = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Nhap ten: ");
			String name = scanner.nextLine();
			System.out.println("Nhap tuoi: ");
			int age = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Nhap que quan: ");
			String country = scanner.nextLine();
			System.out.println("Nhap lop: ");
			String clazz = scanner.nextLine();
			Student std = new Student(id, name, age, country, clazz);
			liststudent.add(std);
			System.out.println("Them thanh cong.");
		}
		
		for (Student student : liststudent) {
			System.out.println(student);
		}
	}
	public static void hiensinhvien(List<Student> liststudent) {
//		System.out.println("Hien sv");
		for (Student student : liststudent) {
			System.out.println(student);
		}
	}
	public static void xoasinhvien() {
		System.out.println("Xoa sv");
	}
	public static void suasinhvien() {
		System.out.println("Sua sv");
	}
}
