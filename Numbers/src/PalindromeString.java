import java.util.Scanner;

public class PalindromeString 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a String ");
		Scanner sc=new Scanner (System.in);
		String str = sc.next();
		String rev="";
		String Ore_str=str;
		for(int i=str.length()-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
			
		}
		if(Ore_str.equals(rev))
		{
			System.out.println("Palindrome String");
		}
		else
		{
			System.out.println("Not palindrome String");
		}
		
	}
		

}
