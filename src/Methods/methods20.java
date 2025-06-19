package Methods;

import ZPrac.Prac1;
//method class me banta h or main method me call hota hai.
public class methods20 {
	//pre-def method
	public static void main(String[] args) {
		//this main is also an pre-defined method
		
		int r=Sum(10,20); //Method Calling
		//this 10 and 20 is an actual parameters
		System.out.println(r);
	}
	
	//creating an user-defined method
	 static int Sum(int a,int b) //method definition
	{
		return a+b;
	}
}

//learn more later about this

//extra
//public static int Sum(int a,int b) {
//	return a*b;
//}
//public static void main(String args[]) {
//	Prac1 s=new Prac1();
//	int a=Sum(10,20);
//	for(int i=1;i<=5;i++) {
//		System.out.println(a);
//	}
//
//}


//extra
//public class Prac1 {
//	public static int add(int a,int b) {
//		return a+b;
//	}
//	public static double sub(double a, double b){
//		return a-b;
//	}
//	public static void main(String[] args) {
//		Prac1 s=new Prac1();
//		int d=s.add(25, 25);
//			System.out.println(d);
//		
//		double e = s.sub(55, 25);
//			System.out.println(e);
//		
//	}
//	
//}