import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonProgram {
	static Scanner scanner = new Scanner(System.in);
	static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		int choice = 0;
		do {
			printMenu();
			choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Enter json file's name to read:");
				String filePath = scanner.nextLine();
				JSONParser parser = new JSONParser();
				FileReader reader = new FileReader(filePath);
				JSONObject jsonobj = (JSONObject) parser.parse(reader);
				
				break;

			default:
				System.out.println("Invalid choice.");
				break;
			}
		} while (choice != 0);
	}
	private static void printMenu() {
		System.out.println("1. Show data.");
		System.out.println("2. Add data.");
		System.out.println("0. Exit.");
		System.out.println("Enter number to continue:");
	}
}
