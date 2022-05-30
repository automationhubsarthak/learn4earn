package file_handling;

import java.io.FileInputStream;
import java.util.Properties;

public class Reading_PropertiesFile {

	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir")+ "\\src\\sarthak\\automation\\file_handling\\test.properties";
        FileInputStream ip = new FileInputStream(path);
        prop.load(ip);
        System.out.println(prop.getProperty("url"));
        System.out.println(prop.getProperty("username"));
        System.out.println(prop.getProperty("password"));
	}

}
