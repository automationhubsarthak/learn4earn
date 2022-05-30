package file_handling;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Read_JSON {

	public static void main(String[] args) throws Exception {
		String path = System.getProperty("user.dir") + "\\src\\sarthak\\automation\\file_handling\\test.json";
		FileReader reader = new FileReader(path);

		JSONParser parser = new JSONParser();
		JSONObject json = (JSONObject)parser.parse(reader);
		System.out.println(json.toJSONString());
		
		JSONArray testData = (JSONArray)json.get("testdata");
		System.out.println(testData.toJSONString());
		JSONObject testDetails = (JSONObject)testData.get(0);
		System.out.println(testDetails);
	}

}
