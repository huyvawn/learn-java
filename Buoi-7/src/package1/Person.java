package package1;
// Dong goi
public class Person {
	private String name;
	private int age;
	
//	Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void study() {
		System.out.println("Ai cung phai hoc.");
	}
	
//	getter & setter
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if(name != null && !name.isEmpty()) {
		this.name = name;
		}
		else {
			System.out.println("Not valid name.");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) {
		this.age = age;
		}
		else 
		{
			System.out.println("Not valid age.");
		}
	}
}
