package Practice;

public class palindrome_no {

	
	public static void main (String [] args) {
		int a=123;
		int b=a;
		int rev=0;
		
		while (a!=0) {
			rev=rev*10+a%10;
			a=a/10;
			
		}
		if(b==rev) {
			System.out.println("is palindrom");
		}
		else {
			System.out.println("not palindrom");
		}
	}
}
