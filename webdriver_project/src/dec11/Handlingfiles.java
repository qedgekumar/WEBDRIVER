package dec11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Handlingfiles {

	public static void main(String[] args)throws Throwable {
		File f = new File("C:\\Users\\pavan\\OneDrive\\Desktop\\file sample1.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("i am writing now");
		bw.newLine();
		bw.write("i am watching tv");
		bw.newLine();
		bw.write("i am playing now");
		bw.newLine();
		bw.write("i am playing carroms");
		bw.flush();
		bw.close();
		

	}

}
