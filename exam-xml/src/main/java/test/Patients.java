package test;
import java.io.Serializable;
import java.time.LocalDate;

import com.thoughtworks.xstream.annotations.XStreamAlias;
@XStreamAlias("Patients")
public class Patients implements Serializable {
int id;
String fullName;
int weight;
float height;
char bloodType;
boolean gender;
String birthDate;
@Override
public String toString() {
	return "Patients [id=" + id + ", fullName=" + fullName + ", weight=" + weight + ", height=" + height
			+ ", bloodType=" + bloodType + ", gender=" + gender + ", birthDate=" + birthDate + "]";
}
public Patients(int id, String fullName, int weight, float height, char bloodType, boolean gender, String birthDate) {
	super();
	this.id = id;
	this.fullName = fullName;
	this.weight = weight;
	this.height = height;
	this.bloodType = bloodType;
	this.gender = gender;
	this.birthDate = birthDate;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}
public float getHeight() {
	return height;
}
public void setHeight(float height) {
	this.height = height;
}
public char getBloodType() {
	return bloodType;
}
public void setBloodType(char bloodType) {
	this.bloodType = bloodType;
}
public boolean isGender() {
	return gender;
}
public void setGender(boolean gender) {
	this.gender = gender;
}
public String getBirthDate() {
	return birthDate;
}
public void setBirthDate(String birthDate) {
	this.birthDate = birthDate;
}
}
