
public class Employee
{
	int id;
	String name;
	float sal;
	 void insert(int id,String n,float sal)
	 {
		 id=id;
		 name=n;
		 sal=sal;
		 
	 }
	 void display()
	 {
		 System.out.println(id+" "+name+" "+sal);
	 }

} class Test
{
	public static void main(String[] args) 
	{
	 Employee e1=new Employee();
	 Employee e2=new Employee();
	 Employee e3=new Employee();
	 e1.insert(1, "mk", 25000);
	 e2.insert(2, "sal", 35000);
	 e3.insert(3, "inn", 40000);
//	 e1.id=1; e1.name="mk"; e1.sal=25000;
//	 e2.id=2; e1.name="salman"; e1.sal=35000;
//	 e3.id=3; e1.name="mustak"; e1.sal=45000;
	 e1.display();
	 e2.display();
	 e3.display();
//	 System.out.println();
	 
		
	}
}
