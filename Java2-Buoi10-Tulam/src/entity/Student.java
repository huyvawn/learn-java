package entity;

public class Student extends Person {

	private double diemtin;
	private double diemtoan;
	public Student(int id, String name, int age, String country, double diemtin, double diemtoan) {
		super(id, name, age, country, 0);
		this.diemtin = diemtin;
		this.diemtoan = diemtoan;
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
	public double getTrungbinh() {
		return (diemtin+diemtoan)/2;
	}
	@Override
	public String toString() {
		return "Student [id=" +getId() +", name=" + getName()+ ", age =" + getAge() +", country =" + getCountry() +
				", diemtin=" + diemtin + ", diemtoan=" + diemtoan + ", trung binh =" + getTrungbinh() + "]";
	}
	public void displayInfo() {
		System.out.println("Student [id=" +getId() +", name=" + getName()+ ", age =" + getAge() +", country =" + getCountry() +
				", diemtin=" + diemtin + ", diemtoan=" + diemtoan + ", trung binh =" + getTrungbinh() + "]");
	}

}
