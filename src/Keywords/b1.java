package Keywords;


class c1{
	// super keyword refer to parent class instance variable
	
	int a;
	
}

public class b1 extends c1{

	public void m1(int a) {
		
		System.out.println(20);
		super.a=a;
	}
	public static void main(String[] args) {
		
		b1 b=new b1();
		b.m1(10);

	}

}
