
public class MissingNumberInArray 
{
	public static void main(String[] args) 
	{
		int a1[] = {1,2,3,4,5,7};
		
		// array should not have Duplicate 
		//no need to be sorter order
		// values should be in range
		
		
//		logic 
		//1+2+3+5 =11 sum1
		//1+2+3+4+5 =15  sum2
		// sum2-sum1=missing number 
		
		int sum1=0;
		for(int i=0;i<a1.length;i++)
		{
			sum1=sum1+a1[i];
			
		}
		System.out.println("sum of the array element is : "+sum1);
		
		int sum2=0;
		for(int i=1;i<=7;i++)
		{
			sum2=sum2+i;
		}
		System.out.println("sum of  range of elelment array : "+sum2);
		System.out.println("Missing number is : "+(sum2-sum1));
		
	}

}
