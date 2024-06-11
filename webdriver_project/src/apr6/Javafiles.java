package apr6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Javafiles {

	public static void main(String[] args) throws Throwable {
		File f=new File("C:\\Sample\\deom8.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("I am learning python");
		bw.newLine();
		bw.write("I am reading novels");
		bw.newLine();
		bw.write("I am searching about software job");
		bw.flush();
		bw.close();
		

	}

}
