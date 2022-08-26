package a010for_loop;

public class prime_number {

	public static void main(String[] args) {
		
	int a=13;
	int temp=0;
	 
	for(int i=2;i<=12;i++) {
		if(a%i==0) {
			temp=temp+1;
		}
	}
if(temp>0) {
	System.out.println("a is not a prime number");
}
else {
	System.out.println("a is prime number");
}
	}

}
