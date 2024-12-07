package ex1_question3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import ex1.Student;

public class StudentSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student("Nguyen Van A");
		Student std2 = new Student("Nguyen Van A");
		Student std3 = new Student("Nguyen Van A");
		Student std4 = new Student("Nguyen Van B");
		Student std5 = new Student("Nguyen Van C");
		Set<Student> studentSet = new HashSet<Student>();
		studentSet.add(std1);
		studentSet.add(std2);
		studentSet.add(std3);
		studentSet.add(std4);
		studentSet.add(std5);
		
//		a. In tong so phan tu student
		System.out.println("So phan tu: "+ studentSet.size());
		for (Student student : studentSet) {
			System.out.println(student);
		}
	}

}
