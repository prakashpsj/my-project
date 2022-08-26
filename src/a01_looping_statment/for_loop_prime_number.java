package a01_looping_statment;

public class for_loop_prime_number {

	public static void main(String[] args) {
    
		// prime no
		int a,b,c;
		
		System.out.println("prime no from 1 to 100 are");
		for(b=1;b<=100;b++) {
			
			c=0 ;
			for(a=2; a<=b/2;a++) {
				if (b % a ==0) {
					
					c++;
					break;
					
				}
			} if(c==0 & b!=1) {
				System.out.println(b + " ");
			}
		}
	}

}
