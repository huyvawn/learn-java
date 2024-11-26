package oop_bai2;

public class ShapeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec1 = new Rectangle(3.5, 4);
		System.out.println("The area of rectangle 1 is: "+ rec1.Area());
		System.out.println("Perimeter of rectangle 1 is: "+ rec1.Perimeter());
		Square sqr1 = new Square(6);
		System.out.println("Area of square 1 is: "+ sqr1.Area());
		System.out.println("Perimeter of square 1 is: "+ sqr1.Perimeter());
	}

}
