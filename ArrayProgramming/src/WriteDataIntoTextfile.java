import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextfile 
{
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("C:\\Users\\HP Folio 9480\\Desktop\\FILEREADER\\mk.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("My name is mustak");
		bw.write("I m software developer");
		bw.write("i am also video creater..");
		System.out.println("Finished....");
	}

}
