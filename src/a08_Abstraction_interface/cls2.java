package a08_Abstraction_interface;

 interface prakash1{
	 
	 void p1();
	 
	 void p2();
	 
}
interface prakash2{
	
	void p3();
}

public class cls2 implements prakash1,prakash2{
	
	public void p1(){
		System.out.println("i am p1");
	}
	public void p2() {
		
		System.out.println("i am p2");
	}
	public void p3(){
		System.out.println("i am p7");
	}

	public static void main(String[] args) {
		
	prakash1 s=new cls2();
	s.p1();
	s.p2();
	
	prakash2 q=new cls2();
	q.p3();
		
   
	}

}
