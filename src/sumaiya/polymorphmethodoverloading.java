package sumaiya;

public class polymorphmethodoverloading {
	public static void main(String args[]) {
		hello h=new hello();
		h.add(10,20);
		h.add(18, 30,48);
		h.add(4.5f,6.7f);
		h.add(4.5f,6.7f,5.8f);
		h.add("sumaiya" , "khan");
		h.add(18, 30);
	}

	
	
	
}
class hello{
	
	void add (int a, int b) {
		System.out.println("int sum="+(a+b));
		
	}
	void add (int a, int b,int c) {
		System.out.println("int sum="+(a+b));
	}
		
		void add (float a, float b) {
			System.out.println("int sum="+(a+b));
		}
			void add (float a, float b,float c) {
				System.out.println("int sum="+(a+b));
			}
			void add(String a,String b) {
				System.out.println("String sum="+(a + b));
			}
			void add(double a,double b) {
				System.out.println("double sum="+(a+b));
				
			}
			
}