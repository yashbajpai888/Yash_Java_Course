package Constructor;

public class DefaultConstructor30 {
	 
//	int a; String b; boolean c;
//	DefaultConstructor30() //default const automatically be also called
//	{
//		a=100;b="ankit";c=true;
//	}
//	void disp() //should be called using object 
//	{
//		System.out.println(a+" "+b+" "+c);
//	}
//	
//	public static void main(String[] args) {
//		DefaultConstructor30 s=new DefaultConstructor30();
//		s.disp();
//	}
	
	//running an same program using diffrent classes
	int a; String b; boolean c;
	DefaultConstructor30() //default const automatically be also called
	{
		a=100;b="ankit";c=true;
	}
	void disp() //should be called using object 
	{
		System.out.println(a+" "+b+" "+c);
	}
}
// so to run this b class go to configuration setting and select b class then run it will run the program
class B{
	public static void main(String[] args) {
		DefaultConstructor30 s=new DefaultConstructor30();
		s.disp();
	}
}