package dec7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;

public class Handlingfile8 {

	public static void main(String[] args)throws Throwable {
		FileReader fr = new FileReader("C:\\sample1\\demo2.note.txt");
		BufferedReader br = new BufferedReader(fr);
		String str =" ";
		while ((str=br.readLine())!=null) {
			Thread.sleep(2000);
			System.out.println(str);



		}
		br.close();
	}

}
