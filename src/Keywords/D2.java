package Keywords;

// we can not override the final method

class d3{
	 
	 public void d1(int a,char b) {
		System.out.println("Engineer");
	}
}


public class D2 extends d3 {
	
	public void d1(int a,char b) {
		
		System.out.println("Docter");
		
	}
	
	public static void main(String[] args) {
		
	D2 s=new D2 ();
	s.d1(10,'a');

		 
           
	}

}

