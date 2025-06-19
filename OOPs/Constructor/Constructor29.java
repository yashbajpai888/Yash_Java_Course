package Constructor;

public class Constructor29 {

	int empId; String name; //instance variable

	//Constructor
	Constructor29(){
		empId=101; name="yash"; 
	}
	void show() {
		System.out.println(empId+" "+name);
	}
}

class Constructor29B{
	public static void main(String[] args) {
		Constructor29  ref=new Constructor29(); //this is an constructor and ref is an reference variable	
		//this will be called automatically while creating an object.
		
		//but we have to call show method()
		ref.show(); //
		
	}
}
