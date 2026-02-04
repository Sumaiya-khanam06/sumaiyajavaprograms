package sumaiya;

public class methodoverriding1 {
	public static void main(String args[]) {
		polygonn t=new polygonn();
		t.greet();
		t.nos();
		t.area();
	}
}
class polygonn{
	void greet()
	{
		System.out.println("good morning");
	}
	void nos()
	{
		System.out.println("polygon have many sides");
	}
	void area() {
		System.out.println("polygon have areas");
	}
}
class triangle extends polygonn{
	void nos() {
		System.out.println("i have 3 sides");
	}
	void area() {
		System.out.println("area=1/2*base*height");
	}
}