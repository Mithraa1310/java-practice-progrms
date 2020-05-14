package week1.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Username {

	public static void main(String[] args) {
		String input="Testleaf$123";
		/*
		 * if(input.length()<8) { System.out.println("invalid username"); }
		 * if(input.matches("[A-Za-z0-9@$_.]")) { System.out.println("valid username");
		 * }
		 */
String pattern="[A-Za-z0-9._$@]{8,}";
Pattern p=Pattern.compile(pattern);
Matcher m=p.matcher(input);
System.out.println(m.matches());
	}

}
