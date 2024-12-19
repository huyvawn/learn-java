import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DemoProcedure {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String jdbcurl = "jdbc:mysql://localhost:3306/dbfpt";
		String username = "root";
		String password = "root";
		
		Connection connection = DriverManager.getConnection(jdbcurl,username,password);
		String procedureCall = "{CALL GetStudentsByClass(?)}";
		CallableStatement callprocedure = connection.prepareCall(procedureCall);
		callprocedure.setString(1, "PHP");
		ResultSet resultSet = callprocedure.executeQuery();
		while (resultSet.next()) {
			int javaid = resultSet.getInt("id");
			String javaname = resultSet.getString("name");
			int javaage = resultSet.getInt("age");
			String javacountry = resultSet.getString("country");
			String javaclazz = resultSet.getString("clazz");
			
			System.out.println(javaid + "-" + javaname + "-" + javaage + "-" + javacountry + "-" + javaclazz);
		}
	}

}
