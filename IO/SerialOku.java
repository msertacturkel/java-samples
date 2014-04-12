import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerialOku {

	public static void main(String[] args) {
		try {
			FileInputStream fi = new FileInputStream("sinif");
			ObjectInputStream os = new ObjectInputStream(fi);
			/*
			 * Object obj1 = os.readObject(); Object obj2 = os.readObject();
			 * String s=(String)obj2;
			 */
			while (true) {
				try {
					Object obj = os.readObject();
					Class sinif = obj.getClass();
					System.out.println(sinif.getName());
				} catch (java.io.EOFException e) {
					break;
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
