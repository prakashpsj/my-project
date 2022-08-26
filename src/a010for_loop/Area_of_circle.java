package a010for_loop;

import java.util.Scanner;

public class Area_of_circle {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the radius ofcircle");
		int r=sc.nextInt();
		double pi=3.14;
		
		//area of the circle=2*pi*r
		System.out.println("area of circle=" +2*pi*r);
		
		
	}

}
