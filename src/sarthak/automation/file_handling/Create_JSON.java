package file_handling;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Create_JSON {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		JSONObject employee1 = new JSONObject(); //this class helps to build a JSON Object
		employee1.put("name", "EmployeeA");
		employee1.put("salary", "100000");
		employee1.put("place", "Canada");
		
		System.out.println(employee1.toJSONString());
		
		JSONObject employee2 = new JSONObject(); 
		employee2.put("name", "EmployeeB");
		employee2.put("salary", "110000");
		employee2.put("place", "USA");
		
		System.out.println(employee2.toJSONString());
		
		
		JSONObject employee3 = new JSONObject(); 
		employee3.put("name", "EmployeeC");
		employee3.put("salary", "120000");
		employee3.put("place", "UK");
		
		System.out.println(employee3.toJSONString());
		
		JSONArray employeeDetails = new JSONArray();
		employeeDetails.add(employee1);
		employeeDetails.add(employee2);
		employeeDetails.add(employee3);
		
		System.out.println(employeeDetails.toJSONString());

	}

}
