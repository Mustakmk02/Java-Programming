
public class LinearSearch 
{
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		int search = 30;
		boolean flage=false; 
		
		for(int i=0;i<a.length;i++)
		{
			if(search==a[i])
			{
				System.out.println("Element found on index num :"+i);
				flage=true;
				break;
			}
		}
		if(flage==false)
		{
			System.out.println("not found elment ");
		}
	}
	

}
