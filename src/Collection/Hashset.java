package Collection;

import java.util.HashSet;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {

		// Hashset 
		// 1.  Not allow duplicate value
		// 2.  We can not handle by index
		
		Set set=new HashSet();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(20);
		
		System.out.println(set);
		
		set.remove(20);
		
		System.out.println(set);    //  [10,30]
		
		System.out.println(set.contains(30)); // true
		
		System.out.println(set.size());
		
		
		System.out.println(set.isEmpty());
		
		set.clear();
		
		System.out.println(set.isEmpty());
		
		
	}

}
