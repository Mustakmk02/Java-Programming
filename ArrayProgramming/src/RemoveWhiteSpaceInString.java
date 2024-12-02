
public class RemoveWhiteSpaceInString 
{
	public static void main(String[] args) {
		String s="Java programming    python   html css ";
		s=s.replaceAll("\\s", "");
		System.out.println(s);
	}

}
