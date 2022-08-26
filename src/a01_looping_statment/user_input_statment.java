package a01_looping_statment;

import java.util.Scanner;

public class user_input_statment {

	public static void main(String[] args) {
      
		System.out.println("enter the 1 st value");
		
		Scanner a=new Scanner(System.in);
		int b=a.nextInt();
		
		System.out.println("enter 2 nd value ");
		Scanner c=new Scanner(System.in);
		int d=c.nextInt();
		
		int e=b+d;
		System.out.println(e);
	}

}
