package javaPractice;

public class Palindrome {
	public static void main(String args[])
	{
		String str1="malayalam";
		String str2="testleaf";
		StringBuilder sb=new StringBuilder(str1);
		sb.reverse();
		String rev=sb.toString();
		if(str1.equals(rev)){
		System.out.println("is Palindrome");
	}
		else
		{
			System.out.println("is not palindrome");
		}
		StringBuilder sb1=new StringBuilder(str2);
		sb1.reverse();
		String rev1=sb1.toString();
		if(str2.equals(rev1)){
		System.out.println("is Palindrome");
	}
		else
		{
			System.out.println(str2+ " is not palindrome");
		}

}
}
