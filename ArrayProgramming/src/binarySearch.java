import java.util.Arrays;

public class binarySearch
{
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};// shuold be in sorter order
		 
		int key=9;
		int low=0;
		int high=a.length-1;
		boolean flage=false;
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(a[mid]==key)
			{
				System.out.println("Element found.. ");
				flage=true;
				break;
			}
			if(a[mid]>key)
			{
				high=mid-1;
			}
			if(a[mid]<key)
			{
				low=mid+1;
			}
		}
		if(flage==false)
		{
			System.out.println("element not found..");
		}
		//logic 2
		
		System.out.println(Arrays.binarySearch(a, 2));
	}
	
}