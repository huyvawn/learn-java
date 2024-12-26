package frontend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import backend.PersonDAOImp;
import entity.Connect;
import entity.Mentor;
import entity.Person;
import entity.Student;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		int id;
		String name;
		int age;
		String country;
		double diemtin;
		double diemtoan;
		int ngaycong;
		int role;
		
		PersonDAOImp test = new PersonDAOImp();
		
		
		do {
			printMenu();
			choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Enter name:");
				name = scanner.nextLine();
				System.out.println("Enter age:");
				age = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter country: ");
				 country = scanner.nextLine();
				System.out.println("Diem tin: ");
				diemtin = scanner.nextDouble();
				scanner.nextLine();
				System.out.println("Diem toan: ");
				diemtoan = scanner.nextDouble();
				scanner.nextLine();
				test.addStudent(name, age, country, diemtin, diemtoan);
				break;

			case 2:
				System.out.println("Enter name:");
				name = scanner.nextLine();
				System.out.println("Enter age:");
				age = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter country: ");
				 country = scanner.nextLine();
				System.out.println("Enter ngaycong: ");
				ngaycong = scanner.nextInt();
				test.addMentor(name, age, country, ngaycong);
				break;
				
			case 3:
//				List<Person> peopleList = test.getAllPeople();
//				for (Person person: peopleList) {
//		            System.out.println(person);
//		        }
				String sqlshowpeople = "SELECT * FROM dbfpt.person inner join dbfpt.role on dbfpt.person.role = dbfpt.role.role;";
				try {
				Connection ketnoi = Connect.getConnection();
					PreparedStatement statement = ketnoi.prepareStatement(sqlshowpeople);
					ResultSet ketqua = statement.executeQuery();
					while (ketqua.next()) {
						 id = ketqua.getInt("id");
						name = ketqua.getString("name");
						 age = ketqua.getInt("age");
						 country = ketqua.getString("country");
						 role = ketqua.getInt("role");
						String roleName = ketqua.getString("roleName");
						Person person = new Person(id, name, age, country, role, roleName);
						person.displayInfo();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 4: 
				String sqlshowdata = "SELECT * FROM dbfpt.person where role = 1;";
				try {
				Connection ketnoi = Connect.getConnection();
					PreparedStatement statement = ketnoi.prepareStatement(sqlshowdata);
					ResultSet ketqua = statement.executeQuery();
					while (ketqua.next()) {
						 id = ketqua.getInt("id");
						name = ketqua.getString("name");
						 age = ketqua.getInt("age");
						 country = ketqua.getString("country");
						 diemtin = ketqua.getDouble("diemtin");
						diemtoan = ketqua.getDouble("diemtoan");
						Student student = new Student(id, name, age, country, diemtin, diemtoan);
						student.displayInfo();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case 5:
				String sqlshowmentor = "select * from dbfpt.person where role = 2;";
				try {
					Connection ketnoi = Connect.getConnection();
					PreparedStatement statement = ketnoi.prepareStatement(sqlshowmentor);
					ResultSet ketqua = statement.executeQuery();
					while (ketqua.next()) {
						 id = ketqua.getInt("id");
						name = ketqua.getString("name");
						 age = ketqua.getInt("age");
						 country = ketqua.getString("country");
						 ngaycong = ketqua.getInt("ngaycong");
						Mentor mentor = new Mentor(id, name, age, country, ngaycong);
						mentor.displayInfo();
						}
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				break;
				
			default:
				System.out.println("Invalid choice.");
				break;
			}
		} while (choice != 9);
	}

	public static void printMenu() {
		System.out.println("-----Management Program -----");
		System.out.println("1. Create Student.");
		System.out.println("2. Create Mentor.");
		System.out.println("3. Show All");
		System.out.println("4. Show Student.");
		System.out.println("5. Show Mentor.");
		System.out.println("9. Exit.");
	}
}
