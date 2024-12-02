import java.util.Arrays;
import java.util.Collections;

public class SortingElement 
{
	public static void main(String[] args) {
		// Approach #1
		/*int a[] = {5,3,4,2,6,1,8,10};
		 System.out.println("Sorting before the element "+ Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("Sorting after the element "+ Arrays.toString(a)); 
		
		// Approach #2
		 System.out.println("Sorting before the element "+ Arrays.toString(a));
		 Arrays.sort(a);
		 System.out.println("Sorting after the element "+ Arrays.toString(a));*/

		 
		 //Reverse or descending order
			Integer a[] = {5,3,4,2,6,1,8,10};
			
		 System.out.println("Sorting before the element "+ Arrays.toString(a));
         Arrays.sort(a,Collections.reverseOrder());
		 System.out.println("Sorting after the element "+ Arrays.toString(a));

	}
	

}
