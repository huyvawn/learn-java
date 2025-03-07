package entity;

public class Person {
	private int id;
	private String name;
	private int age;
	private String country;
	private int role;
	private String roleName;
	
	public Person(int id, String name, int age, String country, int role) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.country = country;
		this.role = role;
	}
	
	public Person(int id, String name, int age, String country, int role, String roleName) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.country = country;
		this.role = role;
		this.roleName = roleName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", country=" + country + ", role=" + role + "]";
	}
	
	public void displayInfo() {
		System.out.println("Person [id=" + id + ", name=" + name + ", age=" + age + ", country=" + country + ", role=" + role + ", role name= " + roleName + "]");
	}
	
	
	
}
