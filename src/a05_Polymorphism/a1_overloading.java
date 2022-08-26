package a05_Polymorphism;

public class a1_overloading {

	public void m1(int a, String b) {
		
		System.out.println("hello1");
		
	}
	public void m1(String b, int a,int c) {
		
		System.out.println("hello2");
		
	}
	
	
	public static void main(String[] args) {
		
		a1_overloading a=new a1_overloading();
		
		a.m1(10, "prakash");
		a.m1("sam",5,4);
		
   
		
	}

}
