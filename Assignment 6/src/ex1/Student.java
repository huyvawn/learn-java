package ex1;

class Student {
	private int id;
	private String name;
	private static String college;
	private static double moneyGroup;
	public Student(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
//		Student.college = college;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name+ ", college=" + college+ ", moneyGroup =" + moneyGroup + "]";
	}
	public static double getMoneyGroup() {
		return moneyGroup;
	}
	public static void setMoneyGroup(double moneyGroup) {
		Student.moneyGroup = moneyGroup;
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
	public static String getCollege() {
		return college;
	}
	public static void setCollege(String college) {
		Student.college = college;
	}
	public static void nopQuy(double amount) {
		Student.moneyGroup += amount;
	}
	public static void rutQuy(double amount) {
		Student.moneyGroup -= amount;
	}
}
