package Practice;

public class Reverse_String {

	public static void main(String[] args) {

		String a= "Prakash";
		
		String rev ="";
		
		int b=a.length();
		System.out.println(b);
		
		for(int i=b-1;i>=0;i--) {
			
			rev=rev+a.charAt(i);
			
	
		}			
		
		System.out.println(rev);

	}

}
