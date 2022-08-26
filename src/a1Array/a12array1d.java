package a1Array;

public class a12array1d {

	public static void main(String[] args) {
		
		// Declaration of array
		
		// int a[];
		// int []a;
		// int[]a;
		// int[] a;      // mostly used
		
		//creation 
		
		//a=new int[3];         // here we fixed size
		
		// declaration &  creation 
		
		int[] a=new int[3];
		
		// initilization  
		
	    a[0]=10;
		a[1]=20;
		a[2]=30;
		
		
	   // a[3]=30;     it will show error ......> Array index out of bounds exception
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		int[] b= {10,20,30,40};
		
		System.out.println(b[3]);
		
	    System.out.println(b.length);
	

}}
