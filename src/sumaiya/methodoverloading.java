package sumaiya;

public class methodoverloading {


	public static void main (String args[]) {
		hello h=new hello();
		h.add(10,15);
		h.add(12, 13,17);
		h.add(10.3f, 12.4f);
	}
}

class hell
{
	void add(int a,int b) {
		System.out.println("int sum="+(a+b));
	}
	void add(int a,int b, int c) {
		System.out.println("sum="+(a+b+c));
	}
	void add(float a,float b) {
		System.out.println("float sum="+(a+b));
	}
}