package quanlysinhvien;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String jdbc, username, password;
		username = "root";
		password = "root";
		jdbc = "jdbc:mysql://localhost:3306/dbfpt";
		
		Connection ketnoi = DriverManager.getConnection(jdbc,username,password);
		
			List<Student> liststudent = new ArrayList<Student>();
			
			while (true) {
			printMenu();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Lua chon chuc nang:");
			try {
				int choice = scanner.nextInt();
				scanner.nextLine();
				switch (choice) {
				case 1:
					themsinhvien(liststudent, scanner, ketnoi);
					break;
				case 2:
					hiensinhvien(liststudent,ketnoi);
					break;
				case 3:
					suasinhvien();
					break;
				case 4:
					hiensinhvien(liststudent,ketnoi);
					xoasinhvien(liststudent, scanner);
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
				System.out.println(e);
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
	
	public static void themsinhvien(List<Student> liststudent, Scanner scanner, Connection ketnoi) throws SQLException {
		System.out.println("So sinh vien ban muon them: ");
		
		int times = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < times; i++) {
			System.out.println("Nhap ten: ");
			String name = scanner.nextLine();
			System.out.println("Nhap tuoi: ");
			int age = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Nhap que quan: ");
			String country = scanner.nextLine();
			System.out.println("Nhap lop: ");
			String clazz = scanner.nextLine();
			String themdulieu = "insert into students (`name`, age, country, clazz)"
					+ "values (?,?,?,?);";
			PreparedStatement insert = ketnoi.prepareStatement(themdulieu);
			insert.setString(1, name);
			insert.setInt(2, age);
			insert.setString(3, country);
			insert.setString(4, clazz);
			insert.executeUpdate();
			System.out.println("Them du lieu thanh cong");

		}
		
		
	}
	public static void hiensinhvien(List<Student> liststudent, Connection ketnoi) throws SQLException {
		String lenhshowdata = "select * from dbfpt.students;";
		PreparedStatement statement = ketnoi.prepareStatement(lenhshowdata);
		ResultSet ketquatrave = statement.executeQuery();
		while (ketquatrave.next()) {
			int id = ketquatrave.getInt("id");
			String name = ketquatrave.getString("name");
			int age = ketquatrave.getInt("age");
			String country = ketquatrave.getString("country");
			String clazz = ketquatrave.getString("clazz");
			
			System.out.println(id +"- " + name +"- " + age +"- " + country +"- " + clazz);
		}
	}
	public static void xoasinhvien(List<Student> liststudent, Scanner scanner) {
		System.out.println("Chon id sinh vien ban muon xoa: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		for (Student student : liststudent) {
			if (student.getId() == id) {
				liststudent.remove(student);
				break;
			}
		}
		System.out.println("Xoa thanh cong!");
	}
	public static void suasinhvien() {
		System.out.println("Sua sv");
	}
}
