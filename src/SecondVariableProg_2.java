// This program is about variables
public class SecondVariableProg_2 {
	int a = 10; /*instance var it'll inside clss but outside any  methods 
	 its an class var can only accessed by making an object.*/
	static double b = 20;	//static 

	public static void main(String[] args) {
		boolean c = true; //local var

	 SecondVariableProg_2	s=new SecondVariableProg_2();
		System.out.println(s.a+" "+b+" "+c);

		/*System.out.println(s.a);
	System.out.println(b);
	System.out.println(c);	*/
}
}
