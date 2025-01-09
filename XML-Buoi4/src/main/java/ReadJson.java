import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJson {
	public static void main(String[] args) {
		String jsonString = "{\r\n"
				+ "\"name\":\"Nguyen Van A\",\r\n"
				+ "\"age\":30,\r\n"
				+ "\"country\":\"Ha Noi\",\r\n"
				+ "}";
		JSONParser parser = new JSONParser();
		try {
			JSONObject jsonobj = (JSONObject) parser.parse(jsonString);
			String name = (String) jsonobj.get("name");
			long age = (long) jsonobj.get("age");
			String country = (String) jsonobj.get("country");
			System.out.println("Ten: " + name);
			System.out.println("Tuoi: " + age);
			System.out.println("Que quan: "+ country);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Loi: "+ e.getMessage());
		}
	}
}
