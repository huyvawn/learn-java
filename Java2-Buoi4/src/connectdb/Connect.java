package connectdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Connect {
	public static void main(String[] args) throws SQLException {
		String jdbc, username, password;
		username = "root";
		password = "root";
		jdbc = "jdbc:mysql://localhost:3306/dbfpt";
		
		Connection ketnoi = DriverManager.getConnection(jdbc,username,password);
		System.out.println(ketnoi);
		//Show du lieu tu database
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
		// Insert du lieu tu database
					String themdulieu = "insert into students (`name`, age, country, clazz)"
							+ "values (?,?,?,?);";
					PreparedStatement insert = ketnoi.prepareStatement(themdulieu);
					insert.setString(1, "Hoang");
					insert.setInt(2, 40);
					insert.setString(3, "Khanh Hoa");
					insert.setString(4, "Python");
					insert.executeUpdate();
					System.out.println("Them du lieu thanh cong");
	}
}
