package Super;

class C{
	void show() {
		System.out.println("Hello Yash");
	}
}
class D extends C{
	void show() {
		System.out.println("Yash Hello"); //this will target local d method 
		//To target C method use super keyword
		super.show(); //class c method
	}
}

public class AccessSuperMethod35 {
	public static void main(String[] args) {
		D r=new D();
		r.show();
	}
}
