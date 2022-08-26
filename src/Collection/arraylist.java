package Collection;


import java.util.ArrayList;
import java.util.List;

public class arraylist {

	public static void main(String[] args) {
   
		// ArrayList
		// 1.allow duplicate value
		// 2 we can handle by index
		
		
	  List list=new ArrayList();
	  
	  
	  list.add(10);
	  list.add(20);
	  list.add(30);
	  list.add("prakash");
	  list.add("c");
	  list.add(30);
	  list.add(40);
	  list.add(70);
	  list.add('#');
	  list.add('/');
	  
	  
	 // list.remove(2);       // it is use for remove 
	  
	  System.out.println(list);
	  System.out.println(list.get(3));
	  System.out.println(list.get(8));
	  System.out.println(list.equals(1));
	  list.remove(1);
	  System.out.println(list);
	  //list.clear();          //it i used to clear all dada from abject
	  System.out.println(list);
	  System.out.println(list.contains(10));
	  System.out.println(list.size());
	  
		
		

	}

}
