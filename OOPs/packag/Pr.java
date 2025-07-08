//This Program is for private package

package Private1;

class Pr
{
	private void show()
	{
		System.out.println("Private Method Package...!");
	}
	public static void main(String args[])
	{
		Pr r=new Pr();
		r.show();
	}
}

//this is just for info 
//is class m agr private member access krke dekhege to //nhi hoga.
/*
class Pri extends Pr
{
	public static void main(String args[])
	{
		Pri r=new Pri();
		r.show();
	}	
}
*/