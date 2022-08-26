package Keywords;
// used to call current class method 
public class m1 {
	
	public void k1() {
		this.k2(10);
		System.out.println("karan");
	}
	public void k2(int q) {
		System.out.println("arjun");
	}

	public static void main(String[] args) {
		
		m1 s=new m1();
		s.k1();
		

	}

}
