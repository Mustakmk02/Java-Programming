
public class PalindromeNumber
{
	public static void main(String[] args) 
	{
		int n=159;   //check the number for palindrome number
		int r,temp,sum=0;
	    temp=n;
	    while(n>0)
	    {
	    	r=n%10;
	    	sum=(sum*10)+r;
	    	n=n/10;
	    }
	    if(temp==sum)
	    {
	    	System.out.println("Palindrome number");
	    }
	    else 
	    {
	    	System.out.println("Not prime number");
	    }
		
		
	}

}
