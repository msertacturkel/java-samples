import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DizinListele {

	private void listele(String path) {
		File dizin = new File(path);
		File[] files = dizin.listFiles();
		for (int i = 0; i < files.length; i++) {
			File file = files[i];

			Date tarih = new Date(file.lastModified());
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm a");
			if (file.isDirectory()){
				System.out.println(sdf.format(tarih) + "\t" + "<DIR>    "
						+ file.getName());
				//listele(path+"\\"+file.getName());
			}
			else
				System.out.println(sdf.format(tarih) + "\t   " + file.length()
						+ "\t" + file.getName());
		}
	}

	public DizinListele() {
		String dizinAdi = "~/SAMPLE";
		listele(dizinAdi);

	}

	public static void main(String[] args) {
		new DizinListele();

	}

}
