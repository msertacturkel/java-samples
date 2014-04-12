import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DosyaBilgi {

	public static void main(String[] args) {
		File dosya=new File("sayilar.txt");
		File dizin=new File("c:/");
		System.out.println("dosya:"+dosya.isFile());
		System.out.println("dizin:"+dizin.isFile());
		System.out.println("dosya:"+dosya.isDirectory());
		System.out.println("dizin:"+dizin.isDirectory());		
		System.out.println("uzunluk:"+dosya.length());
		Date tarih=new Date(dosya.lastModified());
		SimpleDateFormat sdf=new SimpleDateFormat("dd MMM yyyy");
		System.out.println(sdf.format(tarih));

	}

}
