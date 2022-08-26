package Keywords;

public class a1 {

	 // this keyword refer to current class instance variable 
	
	int a;
	public void m1(int a) {
		
		this.a=a;
		System.out.println("prakash");
	}
	public static void main(String[] args) {
		
		a1 b=new a1();
		
		b.m1(10);
		

	}

}
