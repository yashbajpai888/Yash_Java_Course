package Constructor;

public class CopyConstructor32 {
	int a;String b;
	CopyConstructor32(){
		a=64; b="yash";
		System.out.println(a+" "+b);
	}
	CopyConstructor32(CopyConstructor32 ref){
		a=ref.a;
		b=ref.b;
		System.out.println(a+" "+b);
	}
}
class D{
	public static void main(String[] args) {
		CopyConstructor32 c1=new CopyConstructor32();
		CopyConstructor32 c2=new CopyConstructor32();
	}
}