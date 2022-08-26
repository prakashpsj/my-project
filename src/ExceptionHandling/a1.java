package ExceptionHandling;

public class a1 {

	public static void main(String[] args) {
		try {
		int a=10;
		int b=0;       // 
		int c;
		
		c=a/b;
		System.out.println(c);    // Arithmetic Exception
		
	}
catch (Exception e) {
	 
	 
	 System.out.println(e);
	 
 }
 
finally {
	 System.out.println("i am finally block");
 }
	}
	}

	

	
 