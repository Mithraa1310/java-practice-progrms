package week2.day2;

import java.util.HashSet;
import java.util.Set;

public class RetrieveSet2 {

	public static void main(String[] args) {
		Set<Integer> set1=new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		set1.add(7);
		set1.add(8);
		System.out.println(set1);
		/*lambda expression
		 * set1.forEach(each)->{
		 *  if(each==7)
		 *   { System.out.println(each); }
		 *    });
		 */

	}

}
