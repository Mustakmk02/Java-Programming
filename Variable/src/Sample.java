
public class Sample 
{
	public static void main(String[] args) 
//	{
//		int a=20;
//		float b=a;  // widening
//		System.out.println(b);
//		
//		
//
//	}
	{
		float f=20f;
		// int a =f;   Compile time error
		int a = (int) f; //norrowing (Typecasting)
		System.out.println(f); 
		System.out.println(a);
	}

}
