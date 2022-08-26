package a06_Encapsulation;

public class Student {
	
	private int rollNo;    //data hiding
	
	public void setrollNo(int rollNo) {
		
		this.rollNo=rollNo;
	}
	
	public int getrollNo() {
		
	return rollNo;
	}

	public static void main(String[] args) {
		
		Student s=new Student();
		
		s.setrollNo(101);
		
		System.out.println(s.getrollNo());
		
		s.setrollNo(102);
		
 System.out.println(s.getrollNo());
   
	}

}
