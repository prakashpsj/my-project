package Keywords;


      // used to invoke parent class constructor


class c3{
	
	c3(){
		
		System.out.println("i am from c3");
	}
}

public class d01 extends c3 {
	
	
	d01(){
		
		System.out.println("i am  from b3");
	}
	
	public static void main(String[] args) {
		
		d01 b=new d01();

	}

}
