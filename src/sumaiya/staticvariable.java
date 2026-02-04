package sumaiya;

public class staticvariable {
	public static void main(String args[]) {
		student s1=new student("sumaiya",19,8.7f);
		student s2=new student("shravya",20,8.7f);
		
		System.out.println(student.collage);
		student.collage="CIT";
		
		s1.show();
		s2.show();
	}
	
	
}

class student
{
	String name;
	int age;
	float cgpa;
	static String collage="CIT";
	
	student(String n,int a,float c){
		name=n;
		age=a;
		cgpa=c;
	}

void show() {
	System.out.println(name+"\t"+age+"\t"+cgpa+"\t"+collage);
}
}