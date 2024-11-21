package package1;
//	Da hinh
public class Calculator {
	public int tinhtong(int a, int b) {
		return a+b;
	}
	
	public double tinhtong(double a, double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.tinhtong(3.5,5.5));
	}
}
