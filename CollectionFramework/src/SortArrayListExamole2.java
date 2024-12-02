import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListExamole2 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(62);
		al.add(63);
		al.add(80);
		al.add(82);
		al.add(00);
		al.add(97);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		for(int num:al)
		{
			System.out.println(num);
		}
		
		
		
		
	}

}
