package a02_jump_statment;

public class fibonacci_series {

	public static void main(String[] args) {

		//fibonacci series------0 1 1 2 3 5 8 13 21 34 55 
		
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		
		for(int c=0;c<=50;c++) {
			
			c=a+b;
			a=b;
			b=c;
			
			System.out.println(c);
		}
	}

}
