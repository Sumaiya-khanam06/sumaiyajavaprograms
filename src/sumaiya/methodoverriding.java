package sumaiya;

public class methodoverriding {
    public static void main(String args[]) {
    	rectangle r=new rectangle();
    	r.greet();
    	r.nos();
    	r.area();
    }
}
class polygon 
{
	void greet() {
		System.out.println("good morning");
	}
	void nos() {
		System.out.println("polygon have many sides");
	}
	void area() {
		System.out.println("polygon have areas");
	}
}

class rectangle extends polygon
{
	void nos() {
		System.out.println("i have 4 sides");
	}
	void area() {
		System.out.println("area=length*breadth");
	}
}
