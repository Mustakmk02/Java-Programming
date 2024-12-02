
public class Employe 
{
	int rollNo;
	String name;
	
	void insert1(int rollNo,String name)
	{
		rollNo = rollNo;
		name = name;
		
	}
	void display()
	{
		System.out.println(rollNo+" "+name);
	}
	public static void main(String[] args)
	{
		Employe e=new Employe();
		e.name="mk";
		e.rollNo=111;
		e.display();
		
		
	}

}
