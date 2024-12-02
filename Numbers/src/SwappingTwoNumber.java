
public class SwappingTwoNumber
{
	public static void main(String[] args) 
	{
		int a=10,b=20;
				
		  System.out.println("Before Swapping Values are : "+a+" "+b);
		  
		  //Logic #1
     	  /*     int tamp=a;
		         a=b;
		         b=tamp;
		   System.out.println("After Swapping Values are : "+a+" "+b);  */
		  
		  
		  
//		Logic #2
		  
/*        a=a+b;  //10+20 =30
		  b=a-b;  //30-20 =10
	      a=a-b;  //30-10 =20
		  System.out.println("Before Swapping Values are : "+a+" "+b);    */
		  
//		  Logic #3
		  
	/*	 a=a*b;   10*20=200
		 b=a/b;   200/20=10
		 a=a/b;   200/10=20
		  System.out.println("Before Swapping Values are : "+a+" "+b);  */
		 
		  
		  // logic #4
		  // a=10,b=20;
		  b=a+b-(a=b);
		  System.out.println("Before Swapping Values are : "+a+" "+b);
		  
	}

}
