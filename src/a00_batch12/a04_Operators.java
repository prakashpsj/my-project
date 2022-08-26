package a00_batch12;

public class a04_Operators {

	public static void main(String[] args) {

	
	// Arithmetic operators  +,-,*,/,%.
		int a=10;
		int b=5;
		
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a*b);
	System.out.println(a/b);
	System.out.println(a%b);
	
	
	 // Relational operators  <,>,>=,<=,==,!=
	  
	  
	  System.out.println(a<b);
	  System.out.println(a>b);
	  System.out.println(a>=b);
	  System.out.println(a<=b);
	  System.out.println(a==b);
	  System.out.println(a!=b);
	  
	  // Logical operators   && (and), || (OR),!(logical not)
	   
	  //&& (and)
	  System.out.println(a>b && a>=b);  
	  System.out.println(a<b && a>b);
	  System.out.println(a>b && a<b);
	  System.out.println(a<b && a==b);
	  
	  // (OR)
	  System.out.println(a>b || a>=b);
	  System.out.println(a>b || a<b);
	  System.out.println(a<b || a>b);
	  System.out.println(a==b || a<b);
	  
	  //(Logical not)
	  System.out.println (!(a>b));
	  System.out.println(!(a<b));
	  
	  
	  }

}
