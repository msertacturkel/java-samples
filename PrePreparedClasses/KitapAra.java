import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class KitapAra {

	public KitapAra() throws FileNotFoundException {

		// Klavyeden bilgi girme
		for (int i = 0; i < 5; i++) {
			System.out
					.print("Aradiginiz kitabin yazar adi-soyadi veya kitabin adini giriniz:");
			Scanner sc = new Scanner(System.in);
			String keywords = sc.nextLine().trim();

			try {

				FileInputStream keyword = new FileInputStream("MyBooks"); // dosya oku
				Scanner sc1 = new Scanner(keyword);
				String satir;
				boolean durum = false;
				while (sc1.hasNextLine()) {
					satir = sc1.nextLine();

					StringTokenizer st = new StringTokenizer(satir, ",");
					String ad = st.nextToken().trim();
					// System.out.println(ad);
					String soyad = st.nextToken().trim();
					// System.out.println(soyad);
					String kitapAdi = st.nextToken().trim();
					// System.out.println(kitapAdi);

					if (keywords.equalsIgnoreCase(ad)
							|| keywords.equalsIgnoreCase(soyad)
							|| keywords.equalsIgnoreCase(kitapAdi)) {
						durum = true;
						System.out.println("Kitap Bulundu:" + ad + soyad
								+ kitapAdi);
					}

				}
				if (!durum)
					System.out.println("Aradiginiz kitap kayitli degildir");
			} catch (FileNotFoundException e) {

				e.printStackTrace();

			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		new KitapAra();

	}
}


