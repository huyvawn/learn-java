import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.simple.JSONObject;

public class WriteJsonFromFile {
public static void main(String[] args) throws IOException {
	JSONObject jsonobj = new JSONObject();
	jsonobj.put("name","Nguyen Van B");
	jsonobj.put("age", 50);
	jsonobj.put("country", "Ha Noi");
	
	JSONObject testobj = new JSONObject();
	testobj.put("name", "Test Object");
	testobj.put("age", 50);
	testobj.put("country", "Ha Noi");
	
	JSONArray objList = new JSONArray();
	objList.put(jsonobj);
	objList.put(testobj);
	String filePath = "person_write.json";
	FileWriter file = new FileWriter(filePath);
	file.write(jsonobj.toJSONString());	
	file.flush();
	System.out.println(jsonobj.toJSONString());
	System.out.println("Ghi file thanh cong.");
}
}
