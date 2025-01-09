import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJsonFromFile {
	public static void main(String[] args) throws IOException, ParseException {
		String filePath = "person.json";
		JSONParser parser = new JSONParser();
		FileReader reader = new FileReader(filePath);
		JSONObject jsonobj = (JSONObject) parser.parse(reader);
		
		String name = (String) jsonobj.get("name");
		long age = (long) jsonobj.get("age");
		String country = (String) jsonobj.get("country");
		System.out.println("Ten: " + name);
		System.out.println("Tuoi: " + age);
		System.out.println("Que quan: "+ country);
	}
}
