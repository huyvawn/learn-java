package package1;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person("Hoang",-1);
		System.out.println("Ten luc dau la: "+ person1.getName());
		System.out.println("Tuoi luc dau la: "+person1.getAge());
		
		person1.setName("Minh");
		System.out.println("Ten sau khi sua la: "+ person1.getName());

		person1.setAge(-5);
		
//		Da hinh
		Person person2;
		person2 = new t2404e(null, 0);
		person2.study();
		
		person2 = new t2404f(null, 0);
		person2.study();
	}

}
