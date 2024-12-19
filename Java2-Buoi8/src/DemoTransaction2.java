import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DemoTransaction2 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String jdbcurl = "jdbc:mysql://localhost:3306/dbfpt";
		String username = "root";
		String password = "root";	
		Connection connection = DriverManager.getConnection(jdbcurl,username,password);
		
		try {
			connection.setAutoCommit(false);
			//Insert student
			String sqlinsert = "INSERT INTO students (`name`,age,country,clazz) VALUES (?,?,?,?);";
			PreparedStatement statement = connection.prepareStatement(sqlinsert);
			statement.setString(1, "Nguyen Van E ");
			statement.setInt(2, 40);
			statement.setString(3, "SG");
			statement.setString(4, "PHP");
			statement.executeUpdate();
			System.out.println("Them du lieu student thanh cong.");
			//Insert du lieu enrollment
			String sqlinsert2 = "INSERT INTO enrollments (student_id,course_name) VALUES (?,?);";
			PreparedStatement statement2 = connection.prepareStatement(sqlinsert2);
			statement2.setInt(1, 30);
			statement2.setString(2, "T1234");
			statement2.executeUpdate();
			System.out.println("Them du lieu enrollment thanh cong.");
			//Xoa du lieu student
//			String sqldelete = "DELETE FROM students WHERE id = ?;";
//			PreparedStatement statement3 = connection.prepareStatement(sqldelete);
//			statement3.setInt(1, 10);
//			statement3.executeUpdate();
//			System.out.println("Xoa du lieu thanh cong.");
			
			connection.commit();
		} catch (SQLException e) {
			// TODO: handle exception
			if (connection != null) {
				connection.rollback();
				System.out.println("Du lieu da duoc rollback.");
			}
		}
		
	}

}
