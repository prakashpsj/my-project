package SwipeNO;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the NO");
    int m=s.nextInt();
    
    int a=0;
    int b=1;
    System.out.println("fabonacci series upto "+m+"is");
    System.out.println(a+","+b);
    int c;
    for(int i=1;i<m;i++)
    {
    	c=a+b;
    	System.out.println(","+c);
    	a=b;
    	b=c;
    	
    }
	}

}
