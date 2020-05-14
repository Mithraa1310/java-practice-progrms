package week1.day2;

public class Addition1 {//ascii,regex,character.isdigit

	public static void main(String[] args) {
		String str="asdf1qwer9as8d7";
		int add=0;
		int num = 0;
		for(int i=0;i<str.length();i++)
		{
			char dummy=str.charAt(i);
			if(Character.isDigit(dummy))
			{
				 num=Integer.parseInt(String.valueOf(dummy));
			add=add+num;
			}
		}
		
		System.out.println(add);
		
		
		
		
		
		

}
}