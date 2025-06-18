package NewJava;

public class StringMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Sample strings
		String str = " Java Programming ";
		String str2 = " Java Programming ";
		String emptyStr = " ";
		String blankStr = "  ";
		
		//1. length()
		System.out.println("Length of str: " + str.length());  //Includes spaces
		
		//2. toCharArray()
		char[] chars = str.toCharArray();
		System.out.println("Characters in str: ");
		for (char c : chars) {
			System.out.println(c + " ");
		}
		System.out.println();
		
		//3. compareTo()
		int comparison = str.trim().compareTo(str2);
		System.out.println("Comparison result: " + comparison);
		 
		//4. isEmpty()
		System.out.println("Is emptyStr empty? " + emptyStr.isEmpty()); //true		
		
		//5. isBlank()
		System.out.println("Is blankStr blank? " + blankStr.isBlank()); //true		
		
		//6. charAT()
		System.out.println("Character at index 2: " + str.charAt(2));
		
		//7. startsWith() and endsWith()
		System.out.println("Starts with ' Ja '? " + str.startsWith(" Ja"));
		System.out.println("Ends with 'ing '? " + str.endsWith("ing "));
		
		//8. toLowerCase()
		System.out.println("Lowercase: " + str.toLowerCase());
		
		//9. toUpperCase()
	    System.out.println("Uppercase: " + str.toUpperCase());
	    
	    //10. trim()
	    System.out.println("Trimmed str: '" +str.trim() + "'");
	    
	    //11. strip()
	    System.out.println("Stripped str: '" +str.strip() + "'");
	    
	    //12. stripLeading()
	    System.out.println("Leading stripped str: '" + str.stripLeading() + "'");
	    
	    //13. stripTrailing()
	    System.out.println("Trailing stripped str: '" + str.stripTrailing() + "'");
	    
	    //14. repeat()
	    String repeated = "Java ".repeat(3);
	    System.out.println("Repeated string: " + repeated);
	    
	    //15. contentEquals()
	    boolean contentEqual = str.trim().contentEquals(str2);
	    System.out.println("Content equals? " + contentEqual);
         
	}

}
