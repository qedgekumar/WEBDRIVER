package apr6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JavaR {

	public static void main(String[] args) throws Throwable {
		FileReader fr=new FileReader("C:\\Sample\\deom8.txt");
		BufferedReader br=new BufferedReader(fr);
		String str=" ";
		while((str=br.readLine())!=null)
				{
			Thread.sleep(1000);
			System.out.println(str);
			
				}
		br.close();
		
				

	}

}
