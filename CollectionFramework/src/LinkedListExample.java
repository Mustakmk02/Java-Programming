import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample 
{
	public static void main(String[] args)
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("Salman");
		list.add("sallu");
		list.add("bhai");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
