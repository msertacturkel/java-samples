package DAO;

public class DosyaOku {
	public static void main(String[] args) {
		try {
			java.io.FileInputStream fi = new java.io.FileInputStream(
					"personel.txt");
			java.util.Scanner sc = new java.util.Scanner(fi);
			while (sc.hasNextLine()) {
				String satir = sc.nextLine();
				System.out.println(satir);
			}
		} catch (java.io.FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
