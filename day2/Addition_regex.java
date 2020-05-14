package week1.day2;

public class Addition_regex {

	public static void main(String[] args) {
		
		  String str="asdf1qwer9as8d7";
		   String changed=str.replaceAll("[^0-9]", "");
		  System.out.println(changed); 
		  
		  /*String str="asdf1qwer9as8d7";
		   String changed=str.replaceAll("\\D", "");
		  System.out.println(changed); */
		  int sol = 0;
		int num = Integer.parseInt(changed);
		while (num > 0) {
			sol += num % 10;
			num /= 10;
		}
		System.out.println(sol);
		 
	}
}
		
