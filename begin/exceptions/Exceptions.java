package exceptions;

import java.io.DataInputStream;
import java.io.IOException;

public class Exceptions {

	public static void main(String[] args) {
		DataInputStream ds= new DataInputStream(System.in);
		System.out.print("Sayi gir:");
		try {
			String girilen = ds.readLine();// 1.ci hata kaynagi
			int sayi = Integer.parseInt(girilen);// 2.ci hata kaynagi
			System.out.println(sayi * sayi);
			
		} catch (IOException e) {// 1. hata kaynaginin islendigi yer
			e.printStackTrace();
			
		} catch (NumberFormatException nm) {
			System.out.println("lutfen sayi giriniz..");
		}
	}

}
