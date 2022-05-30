package arrays;

public class MD_Arrays {

	public static void main(String[] args) {
		// [][]
		
		//DataProvider you need 2 Dimensional Array - Automation
		
		int i[][] = new int[4][4];
		
		i[0][0] = 1;
		i[0][1] = 2;
		i[0][2] = 3;
		i[0][3] = 4;
		
		i[1][0] = 1;
		i[1][1] = 2;
		i[1][2] = 3;
		i[1][3] = 4;
		
		
		i[2][0] = 1;
		i[2][1] = 2;
		i[2][2] = 3;
		i[2][3] = 4;
		
		i[3][0] = 1;
		i[3][1] = 2;
		i[3][2] = 3;
		i[3][3] = 4;
		
		for(int j=0 ; j<i.length ; j++) {
			
			for(int k=0 ; k<i.length ; k++) {
				System.out.print(" " + i[j][k]);
			}
		System.out.println();
		}
		
		
		

	}

}
