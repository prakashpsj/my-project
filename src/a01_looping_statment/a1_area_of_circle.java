package a01_looping_statment;

import java.util.Scanner;

public class a1_area_of_circle {

	public static void main(String[] args) {
    
		
	 // Area of circle
		
		System.out.println("enter the radius");
		
		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
		
		double a=3.14*k*k;
		System.out.println(a);
	}

}
