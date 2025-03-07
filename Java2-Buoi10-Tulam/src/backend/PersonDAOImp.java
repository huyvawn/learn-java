package backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Connect;
import entity.Person;

public class PersonDAOImp implements PersonDAO {

	@Override
	public void addStudent(String name, int age, String country, double diemtin, double diemtoan) {
		// TODO Auto-generated method stub
		String sqlinsert = "INSERT INTO person (name,age,country,diemtin,diemtoan,role) VALUES (?,?,?,?,?,1)";
		try {
			Connection ketnoi = Connect.getConnection();
			PreparedStatement statement = ketnoi.prepareStatement(sqlinsert);
			statement.setString(1, name);
			statement.setInt(2, age);
			statement.setString(3, country);
			statement.setDouble(4, diemtin);
			statement.setDouble(5, diemtoan);
			statement.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public List<Person> getAllPeople() {
		// TODO Auto-generated method stub
		List<Person> peopleList = new ArrayList<Person>();
		String sqlshowdata = "SELECT * FROM dbfpt.person inner join dbfpt.role on dbfpt.person.role = dbfpt.role.role;";
		try {
		Connection ketnoi = Connect.getConnection();
			PreparedStatement statement = ketnoi.prepareStatement(sqlshowdata);
			ResultSet ketqua = statement.executeQuery();
			while (ketqua.next()) {
				int id = ketqua.getInt("id");
				String name = ketqua.getString("name");
				int age = ketqua.getInt("age");
				String country = ketqua.getString("country");
				int role = ketqua.getInt("role");
				String roleName = ketqua.getString("roleName");
				Person person = new Person(id, name, age, country, role);
				peopleList.add(person);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return peopleList;
	}

	@Override
	public void addMentor(String name, int age, String country, int ngaycong) {
		// TODO Auto-generated method stub
		String sqlinsert = "INSERT INTO person (name,age,country,ngaycong,role) VALUES (?,?,?,?,2)";
		try {
			Connection ketnoi = Connect.getConnection();
			PreparedStatement statement = ketnoi.prepareStatement(sqlinsert);
			statement.setString(1, name);
			statement.setInt(2, age);
			statement.setString(3, country);
			statement.setDouble(4, ngaycong);
			statement.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	

}
