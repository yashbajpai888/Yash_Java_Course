package yash;
class A
{
	private void show()
	{
		System.out.println("Private Method 		Package...!");
	}
	public static void main(String args[])
	{
		A r=new A();
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