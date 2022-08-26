package Keywords;
// used to invoke current class constructor
public class m2 {
	
	
	m2(){
		this(10);
		System.out.println("engineer");
	}
	m2(int a){
		//this();
		System.out.println("Doctor");
	}

	public static void main(String[] args) {
		
		m2 l=new m2();
		

	}

}
