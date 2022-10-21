
public class Practice1 {

	public static void main(String[] args) {

		int a=121;
		int b=a;
		int rev=0;
		
		while(rev!=0) {
			
			rev=rev*10+a%10;
			a=a/10;
		}
		if(b==0) {
			System.out.println("it is palindrom number");
		}else {
			System.out.println("it is not palindrom number");
		}
			
	}

}
