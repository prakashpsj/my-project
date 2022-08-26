package a00_batch12;

public class a03_Variable_type {
     int  s=20;//Instance variable--->declare inside the class out side the method-->non-static variable
	
     static int q=50;   //  static variables
    
	
	public static void main(String[] args) {
		
          int  p=10;//local variable -declare inside method
          
          a03_Variable_type test=new a03_Variable_type ();//class objet creation-->call non static variable
	   
	   System.out.println(p);
	System.out.println(test.s);
	System.out.println(a03_Variable_type.q);
	    
	      }
      
	      
}
