
public class ReversString 
{
	public static void main(String[] args) 
	{
		String s="Mustak";
		String str="";
		for(int i=s.length()-1;i>=0;i--)
		{
			str =str+s.charAt(i);
			 
			
			
		}
		System.out.println(str.toUpperCase());
		
	}

}
