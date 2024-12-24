package frontend;

import java.util.List;
import java.util.Scanner;

import backend.PersonDAOImp;
import entity.Person;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		PersonDAOImp test = new PersonDAOImp();
		List<Person> peopleList = test.getAllPeople();
		
		do {
			printMenu();
			choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Enter name:");
				String name = scanner.nextLine();
				System.out.println("Enter age:");
				int age = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter country: ");
				String country = scanner.nextLine();
				System.out.println("Diem tin: ");
				double diemtin = scanner.nextDouble();
				scanner.nextLine();
				System.out.println("Diem toan: ");
				double diemtoan = scanner.nextDouble();
				scanner.nextLine();
				test.addStudent(name, age, country, diemtin, diemtoan);
				break;

			case 3:
				for (Person person: peopleList) {
		            System.out.println(person);
		        }
				break;
				
			default:
				System.out.println("Invalid choice.");
				break;
			}
		} while (choice != 9);
	}

	public static void printMenu() {
		System.out.println("-----Management Program -----");
		System.out.println("1. Create Student.");
		System.out.println("2. Create Mentor.");
		System.out.println("3. Show All");
		System.out.println("9. Exit.");
	}
}
