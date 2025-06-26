package alag;

public abstract class Animal {
	Animal(){
		System.out.println("Animals Eats Grass ");
	}
	abstract void Sound();
	void ChangeSound() {
		System.out.println("But Tiger Eats Meat ");
	}
}	
	class Tiger extends Animal{
		void Sound() {
			System.out.println("The Sound Of Tiger Is Like Roaring ");
		}
	}
	
	class AbstractClass{
		public static void main(String[] args) {
			Tiger t=new Tiger();
			t.Sound();
			t.ChangeSound();
		}
	}