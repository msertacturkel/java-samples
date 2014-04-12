package sistem;

import java.io.DataInputStream;
import java.io.IOException;


public class SistemPolym {

	public static void main(String[] args) {
		DataInputStream my=new DataInputStream(Sistem.in);
		
		String satir;
		
		try {
			while ((satir = my.readLine()) != null)
				System.out.println(satir);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}