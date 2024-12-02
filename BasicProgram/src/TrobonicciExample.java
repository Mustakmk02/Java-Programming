
public class TrobonicciExample
{
	public static void main(String[] args)
	{
		int n1=0,n2=1,n3=2,n4,i,count=10;
		System.out.print(n1+ " "+n2+" "+n3);
		for(i=3;count>0;++i)
		{
			n4=n1+n2+n3;
			n1=n2;
			n2=n3;
			n3=n4;
			System.out.print(" "+n4);
			
		}
		
	}
	
	

}
