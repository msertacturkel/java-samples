package mystream;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import fileop.MyDataInputStream;

public class MyDataStreamWebSayfasiOku {

	public static void main(String[] args) {
		// URL sýnýfýnda openStream metodu InputStream döndürür.
		// DataInputStream(InputStream)
		// String readLine()
		try {
			URL u = new URL("http://www.google.com");
			MyDataInputStream ds = new MyDataInputStream(u.openStream());
			String satir;
			while ((satir = ds.readLine()) != null)
				System.out.println(satir);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}