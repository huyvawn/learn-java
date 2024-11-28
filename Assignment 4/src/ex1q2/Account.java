package ex1q2;

public class Account {
	int id;
	String name;
	String email;
	
	@Override
	public String toString() {
		return "id: " + id + "\n name: " + name + "\n email: " + email;
	}
	public Account(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	} 	
}
