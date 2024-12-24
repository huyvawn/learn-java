package qlsv.frontend;

import java.util.List;

import qlsv.backend.StudentDAOImp;
import qlsv.entity.Student;

public class Main {
	public static void main(String[] args) {
		StudentDAOImp test = new StudentDAOImp();
		List<Student> students = test.getAllStudents();
		for (Student student : students) {
            System.out.println(student);
        }
	}
}
