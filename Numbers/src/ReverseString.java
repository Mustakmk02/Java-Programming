
public class ReverseString 
{
	public static void main(String[] args)
	{
         String str="MUSTAK";
         String rev="";
         
         // Using Concatination 
        /*
         *  for(int i=str.length()-1;i>=0;i--)
         {
        	 rev =rev+str.charAt(i);
         }
           System.out.println(rev);  */
         
         
         //#Using charector array
         
        /*  char[] a=str.toCharArray();
          for(int i=a.length-1;i>=0;i--)
          {
        	  rev=rev+a[i];
          }
          System.out.println(rev); */
		
         // #Using StringBuffer reverse String
          
         StringBuffer sb=new StringBuffer(str);
         System.out.println(sb.reverse());
	}
	

}
