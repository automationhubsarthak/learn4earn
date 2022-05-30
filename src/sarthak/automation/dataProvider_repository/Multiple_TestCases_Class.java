package dataProvider_repository;

import org.testng.annotations.Test;

public class Multiple_TestCases_Class {
	
	@Test(dataProviderClass = RepoData.class, dataProvider = "getData")
	public void launchUrl(String user, String browser, String PANCARD, int userid) {
		System.out.println(user + "---" + browser + "---" + PANCARD + "---" + userid);
		
	}
	
	@Test(dataProviderClass = RepoData.class, dataProvider = "getData")
	public void enterCredentials(String user, String browser, String PANCARD, int userid) {
		System.out.println(user + "---" + browser + "---" + PANCARD + "---" + userid);
	}
	
	@Test(dataProviderClass = RepoData.class, dataProvider = "getData")
	public void validateLoginHomePage(String user, String browser, String PANCARD, int userid) {
		System.out.println(user + "---" + browser + "---" + PANCARD + "---" + userid);
	}
	
	@Test(dataProviderClass = RepoData.class, dataProvider = "getData")
	public void logOut(String user, String browser, String PANCARD, int userid) {
		System.out.println(user + "---" + browser + "---" + PANCARD + "---" + userid);
	}

}
