import java.util.Scanner;

public class PalindromeNumber 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int n=sc.nextInt();
		int rev=0; int c=n;
		while(n!=0)
		{
			rev=rev*10 + n%10;
			n=n/10;
//			System.out.println(rev);

		}
		if(c==rev)
		{
			System.out.println(" Palindrome number");
		}
		else 
		{
			System.out.println(" not palindrome number");
		}
	}

}
