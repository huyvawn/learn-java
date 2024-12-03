package ex2;

import java.time.LocalDate;

public class Person {
private String name;
private Gender gender;
private LocalDate dob;
private String address;
public Person(String name, Gender gender, LocalDate dob, String address) {
//	super();
	this.name = name;
	this.gender = gender;
	this.dob = dob;
	this.address = address;
}
@Override
public String toString() {
	return "Person [name=" + name + ", gender=" + gender + ", dob=" + dob + ", address=" + address + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Gender getGender() {
	return gender;
}
public void setGender(Gender gender) {
	this.gender = gender;
}
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
}
