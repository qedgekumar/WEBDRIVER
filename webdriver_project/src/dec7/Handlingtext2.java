package dec7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Handlingtext2 {

	public static void main(String[] args)throws Throwable {
		//create new file
		File f = new File("C:\\sample1\\demo2.note.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("I am learning java");
		bw.newLine();
		bw.write("Iam learning bigdata");
		bw.newLine();
		bw.write("I am learning ruby");
		bw.newLine();
		bw.flush();
		bw.close();

	}

}
