package week1.day2;

public class findcases_numbers {

	//character class and ascii,regex
	public static void main(String[] args) {
		String input="It is Work from Home not Work for Home";
		 int upperCase = 0;  
	        int lowerCase = 0;  
	        int digits = 0;  
	        int others = 0; 
	        for (int i = 0; i < input.length(); i++) {  
	            char ch = input.charAt(i);  
	            if (Character.isUpperCase(ch)) {  
	            	upperCase++;  
	            }  
	            else if (Character.isLowerCase(ch)) {  
	                lowerCase++;  
	            }  
	            else if (Character.isDigit(ch)) {  
	                digits++;  
	            }  
	            else {  
	                others++;  
	            }  
	        }  
			System.out.println(upperCase);
			System.out.println(lowerCase);
			System.out.println(digits);
			System.out.println(others);
			
	        
		

	}

}
