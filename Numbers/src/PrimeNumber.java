//natural number > 1
//Which has only 2 factors 1 and itself 
public class PrimeNumber {
	public static void main(String[] args) {
		int n=12;
		int count=0;
		if(n>1)
		{
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println("Prime number");
			}
			else
			{
				System.out.println("Not prime number");
			}
		}
	}

}
