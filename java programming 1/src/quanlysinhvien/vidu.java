package quanlysinhvien;

public class vidu {
	public static void main(String[] args) {
		System.out.println("Cau lenh 1");
		System.out.println("Cau lenh 2");
		
		try {
			int ketqua = 10/0;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Loi");
		} finally {
			System.out.println("Luon chay k can biet dung sai");
		}
		
		System.out.println("Cau lenh 3");
		System.out.println("Cau lenh 4");
		try {
			int[] dayso = {1,2,3};
			System.out.println(dayso[5]);
		}  catch (Exception e) {
			// TODO: handle exception
			System.out.println("Loi khong xac dinh");
		}
		
	}
}
