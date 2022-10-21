package Practice1;

public class Palindrom_Number {

	public static void main(String[] args) {

		int a=121;
		int b=a;
		int rev=0;
		
		while(a!=0) {
			
			rev=rev*10+a%10;
			a=a/10;
		
		}if(b==rev) {
			
			System.out.println("it is palindrom number");
			
		}else 
			
			System.out.println("not palindrom number");
		}
	}


