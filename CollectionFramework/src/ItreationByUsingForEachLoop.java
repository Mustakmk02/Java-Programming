import java.util.*;  
public class   ItreationByUsingForEachLoop 
{
      public static void main(String args[])
      {  
      ArrayList<String> al=new ArrayList<String>();//Creating arraylist  
      al.add("Mango");//Adding object in arraylist    
      al.add("Apple");    
      al.add("Banana");    
      al.add("Grapes");  
      Iterator itr=al.iterator();
      while(itr.hasNext())
      {
    	  System.out.println(itr.next());
      }
      
  //Traversing list through for-each loop
      
//  for(String fruit:al)    
//    System.out.println(fruit);    
//  
 }  
}     