import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student ("Minh", 20, "Java");
		Student std2 = new Student("Huy", 20, "Web");
//		System.out.println(std1);
		
//		Array
		int[] dayso = {1,2,3,4,5};
		
		System.out.println(dayso[0]);
		
		for (int i = 0; i < dayso.length; i++) {
			System.out.println(dayso[i]);
		}
		
//		Array List
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(std1);
		studentList.add(std2);
//		studentList.remove(0);
		
		for (Student stdlist: studentList) {
			System.out.println(stdlist);
		}
		System.out.println(studentList.get(0));
	}

}
