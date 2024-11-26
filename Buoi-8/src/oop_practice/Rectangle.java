package oop_practice;
import oop_practice.Shape;

 class Rectangle extends Shape {

	public Rectangle(double length, double width) {
		this.length= length;
		this.width = width;
	}
	
	@Override
	double Area() {
		// TODO Auto-generated method stub
		 double area = length*width;
		 return area;
//		System.out.println("The area is :" + area);
	}

	@Override
	double Perimeter() {
		// TODO Auto-generated method stub
		double perimeter = (length+width)*2;
//		System.out.println("The perimeter is: "+ perimeter);
		return perimeter;
	}

}
