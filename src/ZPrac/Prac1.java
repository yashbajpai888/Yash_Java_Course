package ZPrac;

public class Prac1 { 
		
	public static void main(String[] args) {
		Dog d=new Dog();
		Cow c=new Cow();
		d.eat();
		c.eat();
	}
}
class Dog extends Prac1
{
	void eat()
	{
		System.out.println("meat");
	}
}

class Cow extends Prac1
{
	void eat()
	{
		System.out.println("Grass");
	}
}
