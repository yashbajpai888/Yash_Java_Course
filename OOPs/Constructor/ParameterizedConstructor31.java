package Constructor;

public class ParameterizedConstructor31 {
	int a; int b;
	ParameterizedConstructor31(int x, int y){
		a=x; b=y;
	}
	void display() {
		System.out.println(a+" "+b);
	}
}

class C{
	public static void main(String[] args) {
		ParameterizedConstructor31 s=new ParameterizedConstructor31(10,20);
		s.display();
	}
}
