package testng_basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Concepts_DataProvider {
//Technically you guys need to remember 4 steps

	@Test(dataProvider = "getData") //Step 3 - link the test case with the dataProvider = "name of the method in the @DataProvider
	public void RegisterNewUser(String user, String browser, String PANCARD, int userid) { //Step 4 - no of input parameters = number of cols

	}

	@DataProvider // Step 1 - it returns a 2 dimensional Object array

	public Object[][] getData() {

		Object[][] data = new Object[3][4]; // Step 2 - enter the data as per the rows and cols

		data[0][0] = "User1";
		data[0][1] = "Chrome";
		data[0][2] = "APERE1234";
		data[0][3] = 121;

		data[1][0] = "User2";
		data[1][1] = "Edge";
		data[1][2] = "APERE1235";
		data[1][3] = 122;

		data[2][0] = "User3";
		data[2][1] = "Firefox";
		data[2][2] = "APERE1235";
		data[2][3] = 123;

		return data;

	}
}
