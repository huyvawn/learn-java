import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class WriteJsonFromFile {
public static void main(String[] args) throws IOException {
	JSONObject jsonobj = new JSONObject();
	jsonobj.put("name","Nguyen Van B");
	jsonobj.put("age", 50);
	jsonobj.put("country", "Ha Noi");
	
	String filePath = "person_write.json";
	FileWriter file = new FileWriter(filePath);
	file.write(jsonobj.toJSONString());
	file.flush();
	System.out.println("Ghi file thanh cong.");
}
}
