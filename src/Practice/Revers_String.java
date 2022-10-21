package Practice;
   
public class Revers_String {
	 char p='A';
	    char q='C';
	    
	    int x=p;
	    int y=q;
	public static void main(String[] args) {
Revers_String z=new Revers_String();
System.out.println(z.y);
System.out.println(z.x);
   String a="jartaN";
   String b="";
   
   int s=a.length();
   
   for(int i=s-1;i>=0;i--) {
	   b=b+a.charAt(i);
   }
   System.out.println(b);
   
	}

}
