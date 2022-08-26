package a00_batch12;

public class a01_Demo {

	   // 1. class is collection of variables and methods
	    //2. we can declare static and non static member 
	    //3. static --->access classname.static member name.
	    //4. non static -->access, we need create object of class
	         // classname refvar=new  classname();   //refvar.nonstatic member
	          
	   int  a=10;   // instance variable (non static)
	   static int b=20;   // static variables 
	   
	   public  void display ()    {   // non static 
		   System.out.println("i am display method");
	   }
	   public void show() {
	   System.out.println("i am static show method");
	   }
	   public void addition (int p,int q) {
	   int  z=p+q;   //   30+40
	   System.out.println(z);   //  70
	   }
	   public void addition1 ()   {
       int t=10;
      int y=20;
      System.out.println(t+y);  //30
	 }
	   public static void m1() {
		   System.out.println(" static method ");
	   }
       
	public static void main(String[] args) {
		
		
	System.out.println(a01_Demo.b);
	a01_Demo   d=new a01_Demo ();   //object creation
	System.out.println(d.a);
	d.display();
	d.show();
	
	d.addition(30, 40);  //  70
	d.addition1();
	a01_Demo.m1();
	}

}
