import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class DosyaOkuKaresiniDosyayaYaz {

	public static void main(String[] args) {
		try {
			java.io.FileInputStream fi = new java.io.FileInputStream(
					"sayilar.txt");
			FileOutputStream fo = new FileOutputStream("kareleri.txt", true);
			java.util.Scanner sc = new java.util.Scanner(fi);
			PrintStream out = new PrintStream(fo);
			while (sc.hasNextLine()) {
				String satir = sc.nextLine();
				Scanner sc1 = new Scanner(satir);
				while (sc1.hasNextInt()) {
					int sayi = sc1.nextInt();
					out.print(sayi * sayi + "\t");
				}
				out.println();// satir atlatma
			}
			fo.close();
		} catch (java.io.FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
