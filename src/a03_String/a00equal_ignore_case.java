package a03_String;

public class a00equal_ignore_case {

	public static void main(String[] args) {
      
		//  equal ignore  case
		String a="hello";
		String b="HELLO";
		
		System.out.println(a.equalsIgnoreCase(b));
		
		
		String k="virat";
		String l="VIRATi";
		System.out.println(k.equalsIgnoreCase(l));
				
	}

}
