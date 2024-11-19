import java.util.ArrayList;
import java.util.Scanner;

public class QLSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int choice;
		ArrayList<Student> studentList = new ArrayList<>();
		do {
	
		printMenu();
		 choice = scanner.nextInt();
		 scanner.nextLine();
//		System.out.println(choice);
		switch (choice) {
		case 1: {
			System.out.println("Your choice:" +choice);
			taosinhvien(studentList);
			break;
		}
		case 2: {
			System.out.println("Your choice:" +choice);
			xemsinhvien(studentList);
			break;
		}
		case 3: {
			System.out.println("Your choice:" +choice);
			break;
		}
		case 4: {
			System.out.println("Your choice:" +choice);
			break;
		}
		case 5: {
			System.out.println("Goodbye");
			break;
		}
		default:
			System.out.println("Invalid choice!");
//			printMenu();
		}
		} while (choice != 5);
	}

	public static void printMenu() {
		System.out.println("\n Choose your options: \n"
				+ "1. Create Student. \n"
				+ "2. Show Students. \n"
				+ "3. Update Students. \n"
				+ "4. Delete Students.\n"
				+ "5. Exit");
		return;
	}
	
	public static void taosinhvien(ArrayList<Student> studentList) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n Enter student's name: \n");
		
		String name = scanner.nextLine();
//		System.out.println(name);
		System.out.println("\n Enter student's age: \n");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("\n Enter student's class: \n");
		String clazz = scanner.nextLine();
		Student std = new Student(name, age, clazz);
		studentList.add(std);
	}
	
	public static void xemsinhvien(ArrayList<Student> studentList) {
		for (Student stdlist: studentList) {
			System.out.println(stdlist);
		}
	}
	
	public static void xoasinhvien() {
		
	}
}
