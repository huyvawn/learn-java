import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Connection;

public class ConnectionJDBC {
	static String jdbcurl = "jdbc:mysql://localhost:3306/dbfpt";
	static String username = "root";
	static String password = "root";
	static Scanner scanner = new Scanner(System.in);
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(jdbcurl,username,password);
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
	public void getDataByID() throws SQLException {
		String sqlshowdatabyid = "SELECT * FROM dbfpt.students WHERE id = ?;";
		Connection ketnoi = getConnection();
		PreparedStatement statement = ketnoi.prepareStatement(sqlshowdatabyid);
		statement.setInt(1, 3);
		ResultSet ketquatrave = statement.executeQuery();
		ketquatrave.next();
		int javaid = ketquatrave.getInt("id");
		String javaname = ketquatrave.getString("name");
		int javaage = ketquatrave.getInt("age");
		String javacountry = ketquatrave.getString("country");
		String javaclazz = ketquatrave.getNString("clazz") ; 
		System.out.println(javaid+"-"+javaname+"-"+javaage+"-"+javacountry+"-"+javaclazz);
	}
	
	public void insertData() throws SQLException {
		String sqlinsert = "INSERT INTO students (`name`,age, country, clazz)\r\n"
				+ "VALUES (?,?,?,?);";
		Connection ketnoi = ConnectionJDBC.getConnection();
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
	
	public void editData() throws SQLException {
		String sqlupdate = "UPDATE students SET name = ?, age = ? WHERE id = ?;";
		Connection ketnoi = ConnectionJDBC.getConnection();
		PreparedStatement statement = ketnoi.prepareStatement(sqlupdate);
		statement.setString(1, "Nguyen Van B");
		statement.setInt(2, 45);
		statement.setInt(3, 3);
		statement.executeUpdate();
		System.out.println("Da sua thanh cong");
	}
	
	public void deleteData() throws SQLException {
		String sqldelete = "DELETE FROM students WHERE id = ?;";
		Connection ketnoi = ConnectionJDBC.getConnection();
		PreparedStatement statement = ketnoi.prepareStatement(sqldelete);
		statement.setInt(1, 2);
		statement.executeUpdate();
		System.out.println("Xoa du lieu thanh cong.");
	}
	
	public static void printMenu() {
		System.out.println("--- Student Management ---");
		System.out.println("1. Show all students."
						+ "\n2. Create students."
						+ "\n3. Update students."
						+ "\n4. Delete students."
						+ "\n5. Exit. ");
	}
	
	public static void main(String[] args) throws SQLException {
		int choice;
		ConnectionJDBC test = new ConnectionJDBC();
//		test.deleteData();
		
//		test.getDataByID();
//		test.insertData();
//		test.editData();
		
		do {
			printMenu();
			choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				test.getAllData();
				break;
			case 2:
				test.insertData();
				break;
			default:
				System.out.println("Invalid choice.");
				break;
			}
		} while (choice != 5);
	}
}