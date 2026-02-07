package sumaiya;

public class abstract1 {
	public static void main(String args[]) {
		cat c=new cat();
		c.greet();
		c.sound();
		c.sleep();
	}
}
abstract class shape{
	void greet() {
		System.out.println("hello");
	}
	abstract void length();
	abstract void width();
}
	class cat extends rectangle{
		void sound() {
			System.out.println("meow");
		}
		void sleep() {
			System.out.println("grrrrr");
		}
	}
	
	