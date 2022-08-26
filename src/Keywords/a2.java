package Keywords;

public class a2 {

	// used to call current class method
	
	public void m1() {
		
		System.out.println("i am m1");
		//this.m2('p');
		
	}
	
	public void m2(int a) {
		
		System.out.println("i am m2");
	}
	public static void main(String[] args) {

		a2 b=new a2();
		
		b.m1();
		
	}

}
