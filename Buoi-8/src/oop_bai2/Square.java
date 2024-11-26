package oop_bai2;

public class Square implements iCalculate {
	double side;
	public Square(double side) {
		// TODO Auto-generated constructor stub
		this.side = side;
	}
	@Override
	public double Area() {
		// TODO Auto-generated method stub
		double area = side*side;
		return area;
	}
	@Override
	public double Perimeter() {
		// TODO Auto-generated method stub
		double perimeter = 4*side;
		return perimeter;
	}
	
}
