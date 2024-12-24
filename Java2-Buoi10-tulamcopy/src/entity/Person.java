package entity;

public class Person {
	private int id;
	private String name;
	private int age;
	private String country;
	private double diemtin;
	private double diemtoan;
	private double ngaycong;
	private int role;
	
	
	public Person(int id, String name, int age, String country, double diemtin, double diemtoan, double ngaycong,
			int role) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.country = country;
		this.diemtin = diemtin;
		this.diemtoan = diemtoan;
		this.ngaycong = ngaycong;
		this.role = role;
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
	public double getDiemtin() {
		return diemtin;
	}
	public void setDiemtin(double diemtin) {
		this.diemtin = diemtin;
	}
	public double getDiemtoan() {
		return diemtoan;
	}
	public void setDiemtoan(double diemtoan) {
		this.diemtoan = diemtoan;
	}
	public double getNgaycong() {
		return ngaycong;
	}
	public void setNgaycong(double ngaycong) {
		this.ngaycong = ngaycong;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", country=" + country + ", diemtin=" + diemtin
				+ ", diemtoan=" + diemtoan + ", ngaycong=" + ngaycong + ", role=" + role + "]";
	}
}
