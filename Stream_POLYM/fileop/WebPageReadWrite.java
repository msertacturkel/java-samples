package fileop;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;

public class WebPageReadWrite {

	public static void main(String[] args) {
		// URL sinifinda openStream metodu InputStream döndürür.
		// DataInputStream(InputStream)
		// String readLine()
		try {
			URL u = new URL("http://www.csystem.org");
			DataInputStream ds = new DataInputStream(u.openStream());
			FileOutputStream fo=new FileOutputStream("index.html");
			PrintStream out=new PrintStream(fo);
			String satir;
			while ((satir = ds.readLine()) != null){
				System.out.println(satir);//ekrana yaziyor
				out.println(satir);//dosyaya yaziyor
			}
			fo.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}