package oop_practice;

public class ShapeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape rec1 = new Rectangle(2.5,4);
		System.out.println("The area of rec1 is: " + rec1.Area());
		System.out.println("The perimeter of rec1 is: "+ rec1.Perimeter());
		Shape sqr1 = new Square(5);
		System.out.println("The area of square 1 is: " + sqr1.Area());
		System.out.println("The perimeter of square 1 is: " + sqr1.Perimeter());
	}

}
