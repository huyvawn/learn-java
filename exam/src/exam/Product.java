package exam;

public class Product {
	int id;
	String name;
	String thumbnail;
	double price;
	int qty;
	String description;
	
	public Product(int id, String name, String thumbnail, double price, int qty, String description) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.thumbnail = thumbnail;
		this.price = price;
		this.qty = qty;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(id >= 0)
		this.id = id;
		else {
			System.out.println("Invalid id.");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && !name.isEmpty())
		this.name = name;
		else 
			System.out.println("Invalid name.");
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		if (thumbnail != null && !thumbnail.isEmpty())
		this.thumbnail = thumbnail;
		else 
			System.out.println("Invalid thumbnail.");
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price >= 0)
		this.price = price;
		else 
			System.out.println("Invalid price.");
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		if (qty >= 0) {
			this.qty = qty;
		}
		else {
			System.out.println("Invalid quantity.");
		}
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		if (description != null && !description.isEmpty())
		this.description = description;
		else {
			System.out.println("Invalid description.");
		}
	}
	
	public void displayInfo() {
		System.out.println("\n Here is the details of the product:");
		System.out.println(" id: "+ id +
						"\n name: "+ name +
						"\n price: $"+ price +
						"\n quantity: "+ qty +
						"\n description: "+ description);
	}
	
	public boolean checkAvailability(int orderQty) {
		if (orderQty <= qty) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void placeOrder(int orderQty) {
		if (orderQty > qty) {
			System.out.println("Not enough products in stock.");
		}
		else {
			qty -= orderQty;
			double total = orderQty*price;
		System.out.println("The total price for the order of that product is: $"+ total );
		}
	}
	
}
