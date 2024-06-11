package dec11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;

public class Readtext {

	public static void main(String[] args)throws Throwable {
		FileReader fr = new FileReader("C:\\Users\\pavan\\OneDrive\\Desktop\\file sample2.txt");
		BufferedReader br = new BufferedReader(fr);
		String str = "   ";
		while ((str=br.readLine())!=null) {
			Thread.sleep(2000);
			System.out.println(str);
			
		}
		br.close();

	}

}
