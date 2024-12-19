import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DemoTransaction {
	static Scanner scanner = new Scanner(System.in);
 	static String jdbcurl = "jdbc:mysql://localhost:3306/dbfpt";
	static String username = "root";
	static String password = "root";	
 
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
//		Connection connection = DriverManager.getConnection(jdbcurl,username,password);
		DemoTransaction instance = new DemoTransaction();
		int choice;
		do {
			printMenu();
			choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				instance.getAllData();
				break;
			case 2:
				instance.insertStudent();
				break;
			case 4:
				instance.deleteData();
				break;
			case 6:
				instance.insertEnroll();
				break;
			default:
				System.out.println("Error!");
				break;
			}
		} while (choice != 5);
		
	}
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(jdbcurl,username,password);
	}

	public void insertStudent() throws SQLException {
		String sqlinsert = "INSERT INTO students (`name`,age, country, clazz)\r\n"
				+ "VALUES (?,?,?,?);";
		Connection ketnoi = DemoTransaction.getConnection();
		PreparedStatement statement = ketnoi.prepareStatement(sqlinsert);
		System.out.println("Insert student's name: ");
		String name = scanner.nextLine();
		statement.setString(1, name);
		System.out.println("Insert student's age: ");
		int age = scanner.nextInt();
		scanner.nextLine();
		statement.setInt(2, age);
		System.out.println("Insert student's country: ");
		String country = scanner.nextLine();
		statement.setString(3, country);
		System.out.println("Insert student's class: ");
		String clazz = scanner.nextLine();
		statement.setString(4, clazz);
		statement.executeUpdate();
		System.out.println("Them du lieu thanh cong.");
	}
	
	public void insertEnroll() throws SQLException {
		String sqlinsert = "INSERT INTO enrollments (student_id,course_name)\r\n"
				+ "VALUES (?,?);";
		Connection ketnoi = DemoTransaction.getConnection();
		PreparedStatement statement = ketnoi.prepareStatement(sqlinsert);
		System.out.println("Insert student's id: ");
		int student_id = scanner.nextInt();
		scanner.nextLine();
		statement.setInt(1, student_id);
		System.out.println("Insert course's name: ");
		String course_name = scanner.nextLine();
		statement.setString(2, course_name);
		statement.executeUpdate();
		System.out.println("Them du lieu thanh cong.");
	}
	
	public void getAllData() throws SQLException {
		String sqlshowdata = "SELECT * FROM dbfpt.students;";
		Connection ketnoi = getConnection();
		PreparedStatement statement = ketnoi.prepareStatement(sqlshowdata);
		ResultSet ketquatrave = statement.executeQuery();
		while(ketquatrave.next()) {
			int javaid = ketquatrave.getInt("id");
			String javaname = ketquatrave.getString("name");
			int javaage = ketquatrave.getInt("age");
			String javacountry = ketquatrave.getString("country");
			String javaclazz = ketquatrave.getNString("clazz") ; 
			System.out.println(javaid+"-"+javaname+"-"+javaage+"-"+javacountry+"-"+javaclazz);
		}
	}
	
	public void deleteData() throws SQLException {
		int idtodelete;
		String sqldelete = "DELETE FROM students WHERE id = ?;";
		Connection ketnoi = DemoTransaction.getConnection();
		PreparedStatement statement = ketnoi.prepareStatement(sqldelete);
		System.out.println("Enter student's id to delete: ");
		idtodelete = scanner.nextInt();
		scanner.nextLine();
		statement.setInt(1, idtodelete);
		statement.executeUpdate();
		System.out.println("Xoa du lieu thanh cong.");
	}
	
	public static void printMenu() {
		System.out.println("--- Student Management ---");
		System.out.println("1. Show all students."
						+ "\n2. Create students."
						+ "\n3. Update students."
						+ "\n4. Delete students."
						+ "\n5. Exit. "
						+ "\n6. Insert enrollments."	);
	}
	
}
