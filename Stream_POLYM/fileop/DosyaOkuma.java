package fileop;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DosyaOkuma {

	public static void main(String[] args) {
		try {
			FileInputStream fi = new FileInputStream("oku.txt");
			// inputstream'den türemis bir sinif

			MyDataInputStream ds = new MyDataInputStream(fi);// upcast

			String satir;

			while ((satir = ds.readLine()) != null)
				System.out.println(satir);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}