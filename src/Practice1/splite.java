package Practice1;

public class splite {

	public static void main(String[] args) {
		
		String a="prakash@psj";
		String b[]=a.split("@");
		String rev="";
		String b[]=a.split("@");
		int c=a.length();
		
		for(int i=c-1;i>=0;i--) {
			rev=rev+a.charAt(i);
			
			//String b[]=a.split("@");
		}
System.out.println(rev);
	}

}
