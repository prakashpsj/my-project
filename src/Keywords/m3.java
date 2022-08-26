package Keywords;
// used to call parent class method
class p2{
	public void j1() {
	
		System.out.println("sam");
	}
}
public class m3 extends p2 {
	public void j2(){
       super.j1();
		
		System.out.println("ram");
		
	}
	
	public static void main(String[] args) {
		m3 d=new m3();
		d.j2();
		
		  
			
		

	}

}
