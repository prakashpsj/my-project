package a07_abstraction;

abstract class fruit{
	
  abstract void taste();
	
	public void m1() {
		
		System.out.println("I am m1");
		
	}
}

class apple extends fruit{
	
	void taste() {
		
		System.out.println("taste is sweet");
	}
}




public class mango extends fruit {
	
	void taste() {
		System.out.println("taste is sour");
	}

	public static void main(String[] args) {

		fruit apple=new apple();
		fruit mango=new mango();
		
		
		apple.taste();
		apple.m1();
		
		mango.taste();
		mango.m1();
	
		
	}

}
