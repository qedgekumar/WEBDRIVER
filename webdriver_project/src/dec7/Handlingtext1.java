package dec7;

import java.io.BufferedReader;
import java.io.FileReader;

public class Handlingtext1 {

	public static void main(String[] args)throws Throwable {
		//read path of file
		FileReader fr = new FileReader("C:\\Sample\\demo2.txt");
		BufferedReader br = new BufferedReader(fr);
		String str="";
		while ((str=br.readLine())!=null){
			Thread.sleep(1000);
			System.out.println(str);

		}
		br.close();
	}

}
