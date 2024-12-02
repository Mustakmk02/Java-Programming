
public class CopyArray
{
	public static void main(String[] args)
	{
		int arr1[] = new int[]{1,2,3,4,5};//initialize array
		
		int arr2[] = new int[arr1.length]; //create another array
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=arr1[i];
		}
		
		
		//display element of  array arr1
		System.out.println("Elements of  Original array");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+ " ");
		}
		System.out.println();
		
		//Display elements of array arr2
		System.out.println("elements of new array");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+ " ");
		}
		
		System.out.println();
		
	}

}
