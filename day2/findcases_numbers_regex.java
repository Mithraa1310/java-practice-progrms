package week1.day2;

public class findcases_numbers_regex {

	public static void main(String[] args) {
		String input="It is Work from Home not Work for Home";
		String str1=input.replaceAll("[^A-Z]", "");
		System.out.println(str1);
		System.out.println("uppercase letters:" +str1.length());
		String str2=input.replaceAll("[^a-z]", "");
		System.out.println(str2);
		System.out.println("lowercase letters:" +str2.length());
		String str3=input.replaceAll("[^0-9]", "");
		System.out.println(str3);
		System.out.println("digits:" +str3.length());
		String str4=input.replaceAll("[^A-Z]", "");
		System.out.println(str4);
		System.out.println("spaces:" +str4.length());
		
		
		

	}

}
