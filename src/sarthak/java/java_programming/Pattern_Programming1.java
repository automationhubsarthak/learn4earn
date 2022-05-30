package java_programming;

public class Pattern_Programming1 {

	public static void main(String[] args) {
		
		//outer for loop is for rows which shall be represented by i
		//inner for loop is for cols which shall be represented by j
		
		for( int i=1 ; i<=5 ; i++) { // i=3 ; true
			
			for( int j=1 ; j<=i ; j++) { //j=4 ; 4<=3 (false)
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
