import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.json.JSONObject;
import org.json.XML;

public class ConvertXMLToJson {
public static void main(String[] args) throws IOException {
	String xmlFilePath = "person.xml";
	String jsonFilePath = "person_converted.json";
	
	String xmlContent = readFile(xmlFilePath);
	
	JSONObject jsonobj = XML.toJSONObject(xmlContent);
	writeFile(jsonFilePath, jsonobj.toString());
	System.out.println("Da chuyen doi thanh cong.");
}

private static String readFile(String filePath) throws IOException {
	FileInputStream readfile = new FileInputStream(new File(filePath));
	byte[] data = readfile.readAllBytes();
	readfile.close();
	return new String(data, StandardCharsets.UTF_8);
}

private static void writeFile(String filePath, String content) throws IOException {
	FileOutputStream writefile = new FileOutputStream(new String(filePath));
	writefile.write(content.getBytes(StandardCharsets.UTF_8));
	writefile.close();
}
}
