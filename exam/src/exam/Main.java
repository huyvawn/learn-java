package exam;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Creating a new product ...");
		System.out.println("Enter product's id: ");
		while (!scanner.hasNextInt()) {
	        System.out.println("That's not a number! Enter again: ");
	        scanner.next(); // this is important!
	    }
		int id = scanner.nextInt();
		scanner.nextLine();
		Product product1 = new Product(1, "product X", "google.com", 20, 100, "A 2024 headphone model with team X's logo..");
		while (id <= 0) {
			System.out.println("Id must be greater than 0. Enter again: ");
			while (!scanner.hasNextInt()) {
		        System.out.println("That's not a number! Enter again: ");
		        scanner.next(); // this is important!
		    }
			id = scanner.nextInt();
			scanner.nextLine();
		}
		if (id > 0) {
			product1.setId(id);
		}
		
		
		System.out.println("Enter product's name: ");
		String name = scanner.nextLine();
		System.out.println("Name you input: " +name);
		while (name.isBlank()) {
			System.out.println("Please enter product's name: ");
			name = scanner.nextLine();
		}
		product1.setName(name);
		
		System.out.println("Enter url for product's image: ");
		String thumbnail = scanner.nextLine();
		product1.setThumbnail(thumbnail);
		
		System.out.println("Enter product's price: ");
		while (!scanner.hasNextDouble()) {
	        System.out.println("That's not a number! Enter again: ");
	        scanner.next(); // this is important!
	    }
		double price = scanner.nextDouble();
		scanner.nextLine();
		while (price <= 0) {
			System.out.println("Product's price must be greater than 0. Enter again: ");
			while (!scanner.hasNextDouble()) {
		        System.out.println("That's not a number! Enter again: ");
		        scanner.next(); // this is important!
		    }
			price = scanner.nextDouble();
			scanner.nextLine();
		}
		product1.setPrice(price);
		
		System.out.println("Number of products in stock: ");
		while (!scanner.hasNextInt()) {
	        System.out.println("That's not a number! Enter again: ");
	        scanner.next(); // this is important!
	    }
		int qty = scanner.nextInt();
		scanner.nextLine();
		while (qty < 0) {
			System.out.println("Quantity must not be negative. Enter again: ");
			while (!scanner.hasNextInt()) {
		        System.out.println("That's not a number! Enter again: ");
		        scanner.next(); // this is important!
		    }
			qty = scanner.nextInt();
			scanner.nextLine();
		}
		product1.setQty(qty);
		
		System.out.println("Enter product's description: ");
		String description = scanner.nextLine();
		product1.setDescription(description);
		
		System.out.println("\nYour information has been stored.");
		product1.displayInfo();
		
		int orderQty = 0;
		do {
		System.out.println("Enter a desired order quantity: ");
		while (!scanner.hasNextInt()) {
	        System.out.println("That's not a number! Enter again: ");
	        scanner.next(); // this is important!
	    }
		orderQty = scanner.nextInt();
		scanner.nextLine();
		if (orderQty <= 0) {
			System.out.println("Invalid number.");
		}
		} while (orderQty <= 0);
		
		if(product1.checkAvailability(orderQty))
			product1.placeOrder(orderQty);
		else 
			System.out.println("The product is out of stock.");
	}

}
