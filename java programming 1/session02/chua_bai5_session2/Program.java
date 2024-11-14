package chua_bai5_session2;

import chua_bai5_session2.Department;

public class Program {
	public static void main(String[] args) {
		Department department1 = new Department(1,"IT");
//		department1.DepartmentID = 1;
//		department1.DepartmentName = "IT";
		Department department2 = new Department(2,"English");
//		department2.DepartmentID = 2;
//		department2.DepartmentName = "English";
		Department department3 = new Department(3, "Java");
		
		Position position1 = new Position(1,"Student");
//		position1.PositionID = 1;
//		position1.PositionName = "Student";
		
		Position position2 = new Position(2,"Mentor");
//		position2.PositionID = 2;
//		position2.PositionName = "Mentor";
		
		Account acc1 = new Account();
		acc1.AccountID = 1;
		acc1.UserName = "Minh";
		acc1.Gender = Gender.Male;
		acc1.Department = department1;
		acc1.Position = position2;
		
		Clazz class1 = new Clazz(1, "IT1");
		class1.Creator = acc1;
		
		System.out.println(acc1.UserName);
		System.out.println(acc1.Department.DepartmentName);
		System.out.println(acc1.Position.PositionName);
	}
}
