//This program is for Default package

package Default1;
class Def //super class
{
	//default method isme default jruri nhi hota 
	void show()
	{
		System.out.println("Default Method Package...!");
	}
	/* 
	public static void main(String args[])
	{
		Def r=new Def();
		r.show();
	}
	*/
}

// To run this file first open cmd and make it .class file by using super class file name
// and then use this command
// java Default1.Defa
public class Defa  //sub class
{
	public static void main(String args[])
	{
		Def r=new Def();
		r.show();
	}
}