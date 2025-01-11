import java.io.FileWriter;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;
public class writeListToJson {
   public static void main( String[] args ) throws IOException {
	   List<Course> courses = new ArrayList<>();
       courses.add(
           new Course(1, "Java", "25000", "3 Months"));
       courses.add(
           new Course(2, "C++", "20000", "3 Months"));

       // Convert the ArrayList to a JSON array
       ObjectMapper objectMapper = new ObjectMapper();
       try {
           String jsonArray
               = objectMapper.writeValueAsString(courses);
           System.out.println(jsonArray);
           String filePath = "person_write.json";
         	FileWriter file = new FileWriter(filePath);
         	file.write(jsonArray);	
         	file.flush();
       }
       catch (JsonProcessingException e) {
           e.printStackTrace();
       }    
   }
}
// Person class
class Person {
   private String firstName, lastName, contact;
   private int age;
   public Person(String firstName, String lastName, int age, String contact) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.contact = contact;
   }
   public String toString() {
      return "[" + firstName + " " + lastName + " " + age + " " +contact +"]";
   }
}