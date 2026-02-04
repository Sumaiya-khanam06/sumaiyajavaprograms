package sumaiya;
import java.util.Scanner;
public class variable {
	public static void main(String[]args) {
	    employee e1=new employee();
	    employee e2=new employee();
	    employee e3=new employee();
	    employee e4=new employee();
	    
	    e1.name="Sumaiya khanam";
	    e1.id=046;
	    e1.age=22;
	    e1.Salary=500000f;
	    
	    e2.name="Keerthana CS";
	    e2.id=18;
	    e2.age=22;
	    e2.Salary=500000f;
	    
	    e2.name="Shravya";
	    e2.id=16;
	    e2.age=22;
	    e2.Salary=500000f;
	    
	    e2.name="Keerthana yadav";
	    e2.id=19;
	    e2.age=22;
	    e2.Salary=500000f;
	    
	    System.out.println(e1.name+"\t"+e1.id+"\t"+e1.age+"\t"+e1.Salary);
	    
	}
	
}
class employee{
	String name;
	int id,age;
	float Salary;
}