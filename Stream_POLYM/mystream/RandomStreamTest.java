package mystream;

import java.io.DataInputStream;
import java.io.IOException;


public class RandomStreamTest {

	public static void main(String[] args) {
		RandomStream rnd= new RandomStream();
		DataInputStream ds = new DataInputStream(rnd); // upcast
		try {
			String satir;
			
			while ((satir = ds.readLine()) != null)
				System.out.println(satir);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}