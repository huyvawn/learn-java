
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte -> short -> int -> long -> float -> double
		int num = 100;
		System.out.println(num);
		double doublenum = num;
		System.out.println(doublenum);
		double num2 = 9.78;
		int intnum2 = (int)num2;
		System.out.println(intnum2);
		
		//String sang int
		String num3 = "1";
		int intnum3 = Integer.parseInt(num3);
		int tong = intnum3+1;
		System.out.println(tong);
		
//		int sang String
		int num4 = 123;
		String stringnum4 = Integer.toString(num4);
		System.out.println(stringnum4);
		
	}

}
