package Strings;

public class ImmutableString27 {
	//String is immutable 
	 void s() {
		 System.out.println(this);
	 }
	public static void main(String[] args) {
		String str="Yash"; //immutable cannot be changed
		
		str.concat(" Kumar"); //this should change but will not 

		System.out.println(str); //op will be yash not added with kumar
		
		//how to change it 
		//We can do it by cloning it 
		String str2=str.concat(" Kumar");
		System.out.println(str2);
		//here it's not changed to str it's point using str2
		//not created new one
		
		ImmutableString27 e=new ImmutableString27();
		e.s();
	}
}
