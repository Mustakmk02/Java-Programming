import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArraylistExample2 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Bhopal");
		al.add("Indore");
		al.add("sehore");
		al.add("Bangalore");
		al.add("Pune");
		System.out.println("Returning element"+al.get(4));
		al.set(4, "Hydrabad");
		System.out.println(al);
		Collections.sort(al);
		Iterator itr= al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
//		for(String city:al) // by using for-each itretor of elementy 
		
//		{
//			System.out.println(city);
//		}
		
	}

}
