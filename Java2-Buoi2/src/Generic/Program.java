package Generic;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Gen class
		GenericClass<String> test = new GenericClass<String>();
		test.setItem("abc");
		System.out.println(test.getItem());
		
		GenericClass<Integer> test1 = new GenericClass<Integer>();
		test1.setItem(132);
		System.out.println(test1.getItem());
		
		//Generic method
		GenericMethod test3 = new GenericMethod();
		Integer[] intArray = {1,2,3};
		String[] stringArray = {"A","B","C"};
		test3.printArray(intArray);
		test3.printArray(stringArray);
		
		//Generic Interface
		GenericClass2<String> test4 = new GenericClass2<String>();
		test4.display("Hello");
		GenericClass2<Integer> test5 = new GenericClass2<Integer>();
		test5.display(2024);
	}

}
