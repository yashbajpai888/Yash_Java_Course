package yash;
//This program is for protected members
//protected is made when we want ki member vhi tk access ho
//jaha tk hum chahte h.
//this will be accesible within package and class and outside the package by sub class
public class A2
{
	private void show()
	{
		System.out.println("Private Method 		Package...!");
	}
	public static void main(String args[])
	{
		A2 r=new A2();
		r.show();
	}
}
//this is just for info 
//is class m agr private member access krke dekhege to //nhi hoga.
/*
class B
{
	public static void main(String args[])
	{
		A r=new A();
		r.show();
	}	
}
*/

/* this protected member can also be accesed in other packages
or uske lie protected method vali class ko public bnana hota h*/