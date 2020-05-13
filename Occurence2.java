package javaPractice;

public class Occurence2 {

	public static void main(String[] args) {
		String str="you have to find the occurenceof me";
		String changed=str.replaceAll("[^o]", "");
		System.out.println(changed.length());
	}

}
