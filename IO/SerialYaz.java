import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;


public class SerialYaz {

	public static void main(String[] args) {
		try {
			FileOutputStream fo=new FileOutputStream("sinif");
			ObjectOutputStream objs=new ObjectOutputStream(fo);
			objs.writeObject("merhaba");
			objs.writeObject(new Date());
			objs.writeObject(Color.red);
			objs.writeObject("merhaba1");
			Otomobil oto=new Otomobil("audi","A1","kirmizi",1000,1400,2011);
			objs.writeObject(oto);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
