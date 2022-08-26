package a03_String;

import java.util.Scanner;

public class task_a3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string value");
		String a=sc.next();
		int length=a.length();
		String rev="";
		for(int i=length-1;i>=0;i--)
		{rev=rev+a.charAt(i);}
		System.out.println("Reverse of"+a+" is "+rev);  //Reverse of JADHAV is VAHDAJ
		
		}
				
		
	}


