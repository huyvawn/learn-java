
public class Patients {
String name;
int age;
String country;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public Patients(String name, int age, String country) {
	super();
	this.name = name;
	this.age = age;
	this.country = country;
}
}
