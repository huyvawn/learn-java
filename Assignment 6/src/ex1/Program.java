package ex1;

import java.util.ArrayList;
import java.util.List;

class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentlist = new ArrayList<Student>();
		Student std1 = new Student(1, "Nguyen Van A");
		Student std2 = new Student(2, "Nguyen Van B");
		Student std3 = new Student(3, "Nguyen Van C");
		studentlist.add(std1);
		studentlist.add(std2);
		studentlist.add(std3);
		
		Student.setCollege("Dai hoc Bach Khoa");
		for (Student student : studentlist) {
			System.out.println(student);
		}
		
		Student.setCollege("Dai hoc Cong nghe");
		for (Student student : studentlist) {
			System.out.println(student);
		}
		//B1: Tat ca nop quy 100k
		for (Student student : studentlist) {
			student.nopQuy(100000);
		}
		System.out.println("Quy lop hien tai (B1): VND "+ Student.getMoneyGroup());
		//B2: Student thứ 1 lấy 50k đi mua bim bim, kẹo về liên hoan
		std1.rutQuy(50000);
		System.out.println("Quy lop hien tai (B2): VND "+ Student.getMoneyGroup());	
		//B3: Student thứ 2 lấy 20k đi mua bánh mì
		std2.rutQuy(20000);
		System.out.println("Quy lop hien tai (B3): VND "+ Student.getMoneyGroup());
		//B4: Student thứ 3 lấy 150k đi mua đồ dùng học tập cho nhóm
		std3.rutQuy(150000);
		System.out.println("Quy lop hien tai (B4): VND "+ Student.getMoneyGroup());
		//B5: cả nhóm mỗi người lại đóng quỹ mỗi người 50k
		for (Student student : studentlist) {
			student.nopQuy(50000);
		}
		System.out.println("Quy lop hien tai (B5): VND "+ Student.getMoneyGroup());
		}
}
