package a05_Polymorphism;

class a3{
	
	public void grt(int a,String b) {
		
	System.out.println("Hi");
	}
}


public class a4 extends a3 {
	
	public void grt(int a,String b) {
		
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		
		a4 p=new a4();
		p.grt(10, "prakash");

	}

}
