package ex2;

import java.util.ArrayList;
import java.util.Iterator;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student(1, "Nguyen Van A", 1);
		Student std2 = new Student(2, "Nguyen Van B", 1);
		Student std3 = new Student(3, "Nguyen Van C", 1);
		Student std4 = new Student(4, "Nguyen Van D", 2);
		Student std5 = new Student(5, "Nguyen Van E", 2);
		Student std6 = new Student(6, "Nguyen Van F", 2);
		Student std7 = new Student(7, "Nguyen Van G", 3);
		Student std8 = new Student(8, "Nguyen Van H", 3);
		Student std9 = new Student(9, "Nguyen Van I", 3);
		Student std10 = new Student(10, "Nguyen Van J", 3);
		
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(std1);
		studentList.add(std2);
		studentList.add(std3);
		studentList.add(std4);
		studentList.add(std5);
		studentList.add(std6);
		studentList.add(std7);
		studentList.add(std8);
		studentList.add(std9);
		studentList.add(std10);

		for (Student student : studentList) {
//			System.out.println(student);
			student.diemDanh();
		}
		
		ArrayList<Student> group1 = new ArrayList<Student>();
		for (Student student : studentList) {
//			System.out.println(student);
			if (student.group == 1) {
				group1.add(student);
			}
		}
		
		ArrayList<Student> group2 = new ArrayList<Student>();
		for (Student student : studentList) {
//			System.out.println(student);
			if (student.group == 2) {
				group2.add(student);
			}
		}
		
		for (Student student : group1) {
			student.hocBai();
		}
		
		for (Student student : group2) {
			student.donVeSinh();
		}
	}

}
