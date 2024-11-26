
public class Counter {
	static int count= 0;
	String name;
	
	Counter() {
		count ++;
	}
	
	void display () {
		System.out.println(count);
	}
}
