package fileop;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;


public class DosyaYaz {

	public static void main(String[] args) {
		
		//FileOutputStream
		//PrintStream(OutputStream)
		//void println()
		try {
			FileOutputStream fo=new FileOutputStream("yaz.txt");
			PrintStream pr=new PrintStream(fo);//upcast
			pr.println("basardim");
			fo.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
