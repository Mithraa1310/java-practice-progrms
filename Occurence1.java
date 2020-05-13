package javaPractice;

public class Occurence1 {
public static void main(String args[])
{
	String str="you have to find the occurenceof me";
	int count=0;
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)=='o')
		{
			count++;
		}
	}
	System.out.println(count);
	
}
}
