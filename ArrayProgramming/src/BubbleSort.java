import java.util.Arrays;

public class BubbleSort
{
	public static void main(String[] args) {
		int a[] = {2,4,3,5,1};
		int n=a.length;
		System.out.println("Array before sortiong :"+Arrays.toString(a) );
		for(int i=0;i<n-1;i++)//number  of passes
		{
			for(int j=0;j<n-1;j++)//itration
			{
				if(a[j]>a[j+1])
				{
					//swap 
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
			
		}
		System.out.println("Array after Sorting :"+Arrays.toString(a) );
	}

}
