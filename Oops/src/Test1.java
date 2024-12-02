
// this keywords 
public class Test1
{
	int rollNo ;
	String Name, course;
	float fees;
	Test1(int rollno,String Name,String course)
	{
		this.rollNo=rollno;
		this.Name=Name;
		this.course=course;
		
	}
	Test1(int rollNo,String Name,String course,float fees)
	{
//		this.fees=fees;  // constructor must be the first statement
		this(rollNo,course,Name);
		this.fees=fees;
//		this.rollNo=rollNo;
//		this.Name=Name;
//		this.course=course;
//		this.fees=fees;
		
	}
	void display()
	{
		System.out.println(rollNo+" "+Name+" "+course+" "+fees);
	}
	public static void main(String[] args) 
	{
		Test1 t1=new Test1(111,"mk","maths");
		Test1 t2=new Test1(222, "salman","Science",20000f);
		t1.display();
		t2.display();
		
		
	}

}
