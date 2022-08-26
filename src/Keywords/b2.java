package Keywords;

class c2{
	
	// used to call parent class method
	
	public  void m1() {
		
		System.out.println("i am m1 from c2");	
	}
	
}

public class b2 extends c2 {
	
	public void m2() {
		super.m1();
		System.out.println("i am m2 from b2 ");
	}

	public static void main(String[] args) {
		
		b2 b=new b2();
		b.m2();

	}

}
