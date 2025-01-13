package test;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.thoughtworks.xstream.XStream;

public class XMLJsonProgram {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		int choice = 0;
		List<Patients> patientList = new ArrayList<Patients>();
		patientList = inputData();
		do {
			printMenu();
			choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Function deleted.");
				
				break;
			
			case 2:
				 patientList = inputData();
				System.out.println("Patients' list has been created.");
				break;
				
			case 3:
				writeDataToFileJSON(patientList);
				break;
				
			case 4:
				readDataFromFileJSON();
				break;
				
			case 5:
				writeDataToFileXML(patientList);
				break;
			case 6:
				readDataFromFileXML();
				break;
				
			default:
				System.out.println("Invalid choice.");
				break;
			}
		} while (choice != 0);
	}
	private static void printMenu() {
		System.out.println("1. Show data.");
		System.out.println("2. Call inputData().");
		System.out.println("3. Write file to Json file.");
		System.out.println("4. Read Json file.");
		System.out.println("5. Write data to XML file.");
		System.out.println("6. Read data from XML file.");
		System.out.println("0. Exit.");
		System.out.println("Enter number to continue:");
	}
	private static List<Patients> inputData() {
		List<Patients> patientList = new ArrayList<Patients>();
		Patients patient1 = new Patients(1, "Larry Ellison", 60, 1.7f, 'A', false, "1998-12-25");
		Patients patient2 = new Patients(2, "John Pak", 78, 1.86f, 'O', true, "1999-10-25");
		patientList.add(patient1);
		patientList.add(patient2);
		return patientList;
	}
	private static void writeDataToFileJSON(List<Patients> patientList) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
	       try {
	           String jsonArray
	               = objectMapper.writeValueAsString(patientList);
	           System.out.println(jsonArray);
	           String filePath = "Patients.json";
	         	FileWriter file = new FileWriter(filePath);
	         	file.write(jsonArray);	
	         	file.flush();
	       }
	       catch (JsonProcessingException e) {
	           e.printStackTrace();
	       }    
	}
	private static void readDataFromFileJSON() throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		JSONArray patientList = (JSONArray) parser.parse(new FileReader("Patients.json"));

		  for (Object patient : patientList)
		  {
		    JSONObject jsonobj = (JSONObject) patient;

		   long id = (Long) jsonobj.get("id");
		    System.out.println("id:" + id);

		    String fullName = (String) jsonobj.get("fullName");
		    System.out.println("Full name: " + fullName);

		    long weight = (Long) jsonobj.get("weight");
		    System.out.println("Weight: " + weight);
		    
		    double height = (Double) jsonobj.get("height");
		    System.out.println("Height: " + height);
		    
		    String bloodType = (String) jsonobj.get("bloodType");
		    System.out.println("Blood Type: " + bloodType);
		    
		    boolean gender = (Boolean) jsonobj.get("gender");
		    System.out.println("Gender: " + gender);
		    
		    String birthDate = (String) jsonobj.get("birthDate");
		    System.out.println("Birth date: " + birthDate);
		    
		    System.out.println("---------");
		  }
	}
	private static void writeDataToFileXML(List<Patients> patientList) throws IOException {
		 XStream xstream = new XStream();
		  	xstream.alias("Patients", Patients.class);
		    xstream.alias("PatientList", PatientList.class);
		    xstream.addImplicitCollection(PatientList.class, "list");

		    PatientList list = new PatientList();
		    list.add(new Patients(1, "Larry Ellison", 60, 1.7f, 'A', false, "1998-12-25"));
		    list.add(new Patients(2, "John Pak", 78, 1.86f, 'O', true, "1999-10-25"));

		    String xml = xstream.toXML(list);
		    String filePath = "Patients.xml";
         	FileWriter file = new FileWriter(filePath);
         	file.write(xml);	
         	file.flush();
         	
	}
	private static void readDataFromFileXML() {
		try {
			 
		      File myObj = new File("Patients.xml");
		      Scanner myReader = new Scanner(myObj);
//		      while (myReader.hasNextLine()) {
//		        String data = myReader.nextLine();
//		        System.out.println(data); }
		        XStream xstream = new XStream();
		        xstream.allowTypes(new Class[] { Patients.class, PatientList.class });

		        // Configure aliases
		        xstream.processAnnotations(Patients.class);
		        xstream.processAnnotations(PatientList.class);
		        File file = new File("Patients.xml");
		        // Deserialize XML to Java objects
		        PatientList patientList = (PatientList) xstream.fromXML(file);

		        // Print the list of patients
		        for (Patients patient : patientList.getPatients()) {
		            System.out.println(patient);
		        }
		      
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
}
