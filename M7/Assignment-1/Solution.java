import java.util.Scanner;
	final class InputValidator {
		/** 
		   Declaring a string 
		**/
		private String str;
		/** 
		   Declaring string length 
		**/
	    private int len;
	    InputValidator(final String str1) {
	    str = str1;
        len = str.length();	
	    }
	    public boolean validateData() {
	final int b = 6;
	if(len >= b){
		return true;
	}
	return false;
}
}
final class Solution
{
	private Solution() { }
	public static void main(String args[]) {
    	Scanner s = new Scanner(System.in);
    	String input = s.next();
    	InputValidator i = new InputValidator(input);    	
    	System.out.println(i.validateData());
    }
}

