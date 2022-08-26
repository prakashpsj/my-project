package a01_looping_statment;

public class a02_split {

	public static void main(String[] args) {
        
		// split
		
		 String a= "My@Name@is@PRAKASH";
		 
		 String[] b=a.split("@");
		 
		 String b1=b[0];   // My
		 
		 String b2=b[1];    // NAME
		 
		 String b3=b[2];   // is
		 
		 String b4=b[3];   // PRAKASH
		 
		 System.out.println(b2);
	}

}
