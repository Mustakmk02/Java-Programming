
public class A6 implements Printable
{

	@Override
	public void print() {
           System.out.println("hello");		
	}
	public static void main(String[] args) 
	{
		Printable p=new A6();
		p.print();
		
		
	}

}
