
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People std1 = new Student();
		
		People tch1 = new Teacher();
		std1.study();
		tch1.study();
		Teacher tch2 = new Teacher();
		tch2.play1();
		
//		Static
		
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		Counter c4 = new Counter();
		Counter c5 = new Counter();
		c1.display();
		c2.display();
		c3.display();
		//
		int ketqua = Tinhtong.tinh(3,4);
		System.out.println(ketqua);
	}

}
