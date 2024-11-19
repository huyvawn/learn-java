
public class Student {
String  name;
int age;
String clazz;
String country;

	Student (String name, int age, String clazz){
		this.name = name;
		this.age = age;
		this.clazz = clazz;
		this.country = "Ha Noi";
	} 
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			
			return "Student: Name = "+ name + ", Age : "+ age +", Class : "+ clazz;
		}
}
