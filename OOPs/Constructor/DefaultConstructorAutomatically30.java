package Constructor;

public class DefaultConstructorAutomatically30 {
	//jb hum default constructor nhi bnaege khud se to vo automatically call hoga but isme dikkt ye aegi
	//ki uski values null or zero form me aegi like this
	
	int x; String y; boolean z;
		void show() //should be called using object 
		{
			System.out.println(x+" "+y+" "+z);
		}

		public static void main(String[] args) {
			DefaultConstructorAutomatically30 s=new DefaultConstructorAutomatically30();
			s.show();
		}
		
}
//O-P will be 
// 0 null false