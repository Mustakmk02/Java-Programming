import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromTextFile 
{
	// approach #1
	
	public static void main(String[] args) throws IOException
	{
		FileReader fr=new FileReader("C:\\Users\\HP Folio 9480\\Desktop\\FILEREADER\\mk.txt");
		BufferedReader br=new BufferedReader(fr);
		String str;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		br.close();
	}

}
