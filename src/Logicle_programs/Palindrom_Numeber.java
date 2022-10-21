package Logicle_programs;

public class Palindrom_Numeber {

	public static void main(String[] args) {

		int no=121;
		int t=no;
		int rev=0,rem;
		
		while(t!=0) {
			
			rem=t%10;
			rev=rev*10+rem;
			t=t/10;
		}
		if(no==rev) {
			System.out.println(no+"is palindrome number");
		}
		else {
			System.out.println(no + " is not palindrom number");
		}

		}
	}


