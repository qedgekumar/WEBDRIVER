package apr6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Javawriterfile {

	public static void main(String[] args) throws Throwable {
		File f=new File("C:\\Sample.\\deom9.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("I am learning ai");
		bw.newLine();
		bw.write("I am joining as a new software engineer");
		bw.newLine();
		bw.write("I am reading stories");
		bw.flush();
		bw.close();
		
		

	}

}
