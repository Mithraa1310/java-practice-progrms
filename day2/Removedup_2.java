package week2.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Removedup_2 {

	public static void main(String[] args) {
		List<Character> ls=new ArrayList<Character>();
		ls.add('A');
		ls.add('B');
		ls.add('C');
		ls.add('D');
		ls.add('A');
		ls.add('D');
		ls.add('E');
		ls.add('F');
		System.out.println(ls);
		Set<Character> set=new HashSet<Character>(ls);
		System.out.println(set);

	}

}
