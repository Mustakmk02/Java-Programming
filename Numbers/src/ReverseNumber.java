import java.util.Scanner;

public class ReverseNumber 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number ..");
		int n=sc.nextInt();  //123456
		
		//using algorithm
		
	/*	int rev=0;
		while(n!=0)
		{
			rev=rev*10 + n%10;
			n=n/10;
		}
		System.out.println(rev); */
		
		
		// using StrinBuffer
		/*  StringBuffer sb=new StringBuffer(String.valueOf(n));
		StringBuffer rev=sb.reverse();
		System.out.println(rev);
		*/
		
		// using StringBuilder
		
		StringBuilder sb=new StringBuilder();
		sb.append(n);
		StringBuilder rev=sb.reverse();
		System.out.println(rev);
		
		
	}

}
