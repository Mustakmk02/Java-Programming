import java.util.Scanner;

public class Greatest3Number
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number ");
		int b=sc.nextInt();
		System.out.println("Enter third number ");
		int c=sc.nextInt();
		
		// # logic 1
		
	/*	if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is greater..");
			}
			else
			{
				System.out.println("c is  greater..");
			}
			
		}
		else
		{
			if(b>c)
			{
				System.out.println("b is greater");
			}
			else
			{
				System.out.println("c is greater..");
			}
			
		}  */
		if(a>=b && a>c)
		{
			System.out.println(" a is greater..");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater..");
		}
		else
		{
			System.out.println("c is greater..");
	 }
	}

}
