package dec7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Handlingfile6 {

	public static void main(String[] args)throws Throwable {
		File f = new File("C:\\Sample\\demo3.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("i am going to my home");
        bw.newLine();
        bw.write("i am living in hyd");
        bw.newLine();
        bw.write("i want to become software engineer");
        bw.newLine();
        bw.flush();
        bw.close();
	}

}
