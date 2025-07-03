package yash1;
class A1
{
	//default method isme default jruri nhi hota 
	void show()
	{
		System.out.println("Private Method 		Package...!");
	}
	/*public static void main(String args[])
	{
		A1 r=new A1();
		r.show();
	}*/
}
//this is just for info 
//is class m agr default member access krke dekhege //to ho jaega.

class B
{
	public static void main(String args[])
	{
		A r=new A();
		r.show();
	}	
}
