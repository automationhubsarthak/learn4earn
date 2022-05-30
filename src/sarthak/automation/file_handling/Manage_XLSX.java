package file_handling;

public class Manage_XLSX {

	public static void main(String[] args) {
		
	System.out.println(System.getProperty("user.dir"));
	String path = System.getProperty("user.dir") + "\\src\\sarthak\\automation\\file_handling\\Data.xlsx"; 
	Xls_Reader xls = new Xls_Reader(path);
		
	// 1. Counting rows in Excel
	int rows = xls.getRowCount("LoginTest");
	System.out.println(rows);
	
	// 2. Counting cols in Excel
	int cols = xls.getColumnCount("LoginTest");
	System.out.println(cols);
	
	// Reading Data in Excel
	String data = xls.getCellData("LoginTest", "Browser", 2);
	System.out.println(data);
	data = xls.getCellData("TestSheet", 3, 4);
	System.out.println(data);
		
	
	// Writing Data into Excel
	xls.setCellData("LoginTest", "Browser", 10, "OperaBrowser");
	

	}

}
