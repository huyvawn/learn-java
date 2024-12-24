package backend;

import java.util.List;

import entity.Person;

public interface PersonDAO {
	public void addStudent (String name, int age, String country, double diemtin, double diemtoan);
	public void addMentor (Person person);
	public List<Person> getAllPeople();
}
