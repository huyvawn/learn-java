package ex2;

public class Student implements iStudent{
	int id;
	String name;
	int group;
	public Student(int id,String name, int group) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.group = group;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n id: " +id + "\n name: " +name + "\n group: "+ group;
	}
	@Override
	public void diemDanh() {
		// TODO Auto-generated method stub
		System.out.println("\n"+name + " diem danh.");
	}
	@Override
	public void hocBai() {
		// TODO Auto-generated method stub
		System.out.println("\n" +name + " dang hoc bai.");
	}
	@Override
	public void donVeSinh() {
		// TODO Auto-generated method stub
		System.out.println("\n" + name + " dang don ve sinh.");
	}
}
