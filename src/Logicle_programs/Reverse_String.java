package Logicle_programs;

public class Reverse_String {

	public static void main(String[] args) {

		String name = "Prakash";
		
		int L= name.length();
		
		System.out.println(L);
		
		String rev="";
		
		for (int k=L-1;k>=0;k--) {
			
			rev=rev+name.charAt(k);	
		}
	System.out.println("Reverse of"+name+ "is "+rev);

		
	}

}
