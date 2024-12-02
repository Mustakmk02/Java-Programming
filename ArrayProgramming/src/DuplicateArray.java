import java.util.HashSet;

public class DuplicateArray 
{
	public static void main(String[] args) {
		
		// Approach #1
		
/*		String langs []= {"java","c","c++","python","html"};
		boolean flag=false;
		for(int i=0;i<langs.length;i++)
		{
			for(int j=i+1;j<langs.length;j++)
			{
				if(langs[i]==langs[j])
				{
					System.out.println("Duplicate Element found in array :"+langs[i]);
					flag=true;
				}
				
			}
		}
		if(flag==false)
		{
			System.out.println("Duplicate element not found ");
		} */
		
//		Approach #2
		
		String arr[] =  {"java","c","c++","python","html","html"};
		boolean flage=false;
		HashSet<String> langs=new HashSet();
		
		
		for(String l : arr)
		{
			if(langs.add(l)==false)
			{
				System.out.println("Foud duplicate : "+l);
				flage=true;
			}
		}
		if(flage==false)
		{
			System.out.println("Not found duplicate");
		}
		
		
	}

}
