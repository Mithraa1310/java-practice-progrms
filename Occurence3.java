package javaPractice;

public class Occurence3 {

	public static void main(String[] args) {
		String str="you have to find the occurence of me";
		int count=0;
		 char[] chr_array=str.toCharArray();
		 for(int i=0;i<chr_array.length;i++)
		 {
			 if(chr_array[i]=='o')
				count++;
		 }
		 
		 System.out.println(count);
	}

}
