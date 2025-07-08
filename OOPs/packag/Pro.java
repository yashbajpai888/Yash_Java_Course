package Protected1;
//This program is for protected members protected is made when we want ki member vhi tk access ho
//jaha tk hum chahte h, this will be accesible within package and class and outside the package by sub class

public class Pro
{
	protected void show()
	{
		System.out.println("Protected Method Package...!");
	}
/*
	public static void main(String args[])
	{
		Pro r=new Pro();
		r.show();
	}
*/
}
//this is just for info 
//is class m agr private member access krke dekhege to //nhi hoga.

class Prot
{
	public static void main(String args[])
	{
		Prot r=new Prot();
		r.show();
	}	
}


/* this protected member can also be accesed in other packages
or uske lie protected method vali class ko public bnana hota h*/