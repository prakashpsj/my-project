package Logicle_programs;

public class prime_Number {

	public static void main(String[] args) {

  // prime numbers are those number that are fully divided by itself
		
		int a=6;
		int b=0;
		for(int i=2;i<=a-1;i++) {
	
			if(a%i==0) {
				b=b+1;
		
			}
		}if (b==0) {
		System.out.println("prime no");
		
	}else {
		System.out.println("not prime no");
	}

	}
	}
