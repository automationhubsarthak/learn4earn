package thisandsuperkeyword;

public class Concept {

	String S1; //default value is null
	int i; //default value is 0
	
	
	
	public void conceptLearn(String S1, int i) {
		this.S1 = S1;
		this.i = i;
	}
	
	public void conceptTeach() {
		System.out.println(S1);
		System.out.println(i);
	}
	

}
