
public class CountEvenandOddDigit
{
	public static void main(String[] args) {
		int n=3456;
		int even=0;
		int odd=0;
		while(n>0)
		{
			int rem = n%10;// 6 5 4 3 
			if(rem%2==0)
			{
				even++; // 1 2
			}
			else
			{
				odd++; //1 2
			}
			n=n/10;  //345 34 3 0
			
		}
		System.out.println(even); 
//		System.out.println(odd);
		
	}

}
