package ex2;

import java.time.LocalDate;
import java.util.Scanner;

class Program {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Person p1 = new Person("Nguyen Van A",Gender.Male , LocalDate.of(1999, 10, 1), "Address of A");
		System.out.println(p1);
		inputInfo(scanner);
	}
	static void inputInfo(Scanner scanner) {
		System.out.println("Input name: ");
		String name = scanner.nextLine();
		
		System.out.println("Input gender(M or F): ");
		String genderString = scanner.nextLine();
		Gender gender = null;
		if (genderString == "M")
			gender = Gender.Male;
		if (genderString == "F") {
			gender = Gender.Female;
		}
		System.out.println("Input year of birth: ");
		int year = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Input month of birth: ");
		int month = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Input day of birth: ");
		int day = scanner.nextInt();
		scanner.nextLine();
		LocalDate dob = LocalDate.of(year, month, day);
		
		System.out.println("Input address: ");
		String address = scanner.nextLine();
		Person p = new Person(name, gender, dob, address);
		System.out.println("Person created.");
		System.out.println(p);
	}
}
