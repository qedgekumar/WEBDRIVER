package dec7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Handlingfiles {

	public static void main(String[] args)throws Throwable {
		File f = new File("C:\\pavan1\\demo5.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("I am learning embedded");
		bw.newLine();
		bw.write("I am learning linux");
		bw.newLine();
		bw.write("I am learning corejava");
		bw.flush();
		bw.close();
		

	}

}
