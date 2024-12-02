// initiallization object by using reference varibale

 class Student 
{
	int rollno;
	String name;
	
	public static void main(String[] args) 
	{
		Student s1=new Student();
		Student s2=new Student();
		s1.name="mk";
		s1.rollno=1;
		System.out.println(s1.name+ " "+s1.rollno);
		
		
	}

}
