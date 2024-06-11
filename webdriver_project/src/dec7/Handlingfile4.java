package dec7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Handlingfile4 {

	public static void main(String[] args)throws Throwable {
		File f = new File("C:\\Sample\\demo3.note1.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("I am learning testing course");
		bw.newLine();
		bw.write("I am living in srnagar");
		bw.newLine();
		bw.write("I am learing big data eng");
		bw.newLine();
		bw.flush();
		bw.close();
		

	}

}
