import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DizinListeleIciniGoster {

	private void listele(String path) {
		File dizin = new File(path);
		File[] files = dizin.listFiles();
		for (int i = 0; i < files.length; i++) {
			File file = files[i];

			Date tarih = new Date(file.lastModified());
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm a");
			if (file.isDirectory()) {
				System.out.println(sdf.format(tarih) + "\t" + "<DIR>    "
						+ file.getName());
				// listele(path+"\\"+file.getName());
			} else {
				System.out.println(sdf.format(tarih) + "\t   " + file.length()
						+ "\t" + file.getName());
				if (file.getName().endsWith("txt")) {
					System.out
							.println("**************************************");
					try {

						java.util.Scanner sc = new java.util.Scanner(file);
						while (sc.hasNextLine()) {
							String satir = sc.nextLine();
							System.out.println(satir);
						}
					} catch (java.io.FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				// System.out.println("**************************************");
			}
		}
	}

	public DizinListeleIciniGoster() {
		String dizinAdi = "~/SAMPLE";
		listele(dizinAdi);

	}

	public static void main(String[] args) {
		new DizinListeleIciniGoster();

	}

}
