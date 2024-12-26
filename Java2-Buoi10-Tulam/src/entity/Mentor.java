package entity;

public class Mentor extends Person {
	private int ngaycong;

	public Mentor(int id, String name, int age, String country, int ngaycong) {
		super(id, name, age, country, 1);
		this.ngaycong = ngaycong;
	}

	@Override
	public String toString() {
		return "Mentor [ id ="  + getId() + ", getName()=" + getName() + ", getAge()="
				+ getAge() + ", getCountry()=" + getCountry() + ", getRole()=" + getRole() + ", ngaycong=" + ngaycong + "]";
	}

	public int getNgaycong() {
		return ngaycong;
	}

	public void setNgaycong(int ngaycong) {
		this.ngaycong = ngaycong;
	}
	public double getLuong() {
		return ngaycong*1_000_000;
	}
	
	public void displayInfo() {
		System.out.printf("\nMentor [ id ="  + getId() + ", getName()=" + getName() + ", getAge()="
				+ getAge() + ", getCountry()=" + getCountry() + ", ngaycong=" + ngaycong + ", tienluong= %.2f"+ "]\n", getLuong() );
	}
}
