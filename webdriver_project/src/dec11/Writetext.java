package dec11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Writetext {

	public static void main(String[] args)throws Throwable {
		File f = new File("C:\\Users\\pavan\\OneDrive\\Desktop\\file sample2.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("i am playing chess");
		bw.newLine();
		bw.write("i am reading books");
		bw.newLine();
		bw.write("i am chatting with friends");
		bw.newLine();
		bw.flush();
		bw.close();
		

	}

}
