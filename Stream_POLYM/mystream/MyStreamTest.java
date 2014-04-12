package mystream;

import java.io.DataInputStream;
import java.io.IOException;

public class MyStreamTest {

	public static void main(String[] args) {

		MyStream my = new MyStream();
		DataInputStream ds = new DataInputStream(my); // upcast
		try {
			String satir;
			/*while (true) {
				satir = ds.readLine();
				if (satir == null)
					break;
				System.out.println(satir);
			}*/

			while ((satir = ds.readLine()) != null)
				System.out.println(satir);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}