package week1.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

	public static void main(String[] args) {
		String input="mithraajain@gmail.com";
		
		
//regex
		String pattern="[A-Za-z0-9._]+@[A-Za-z]+.[a-z]{2,}";
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(input);
		System.out.println(m.matches());	
	}

}
