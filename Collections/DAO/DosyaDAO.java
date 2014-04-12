package DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class DosyaDAO {

	public DosyaDAO() {
		// TODO Auto-generated constructor stub
	}

	public void kayit(Personel personel) {
	}

	public List<Personel> findAll() {
		ArrayList<Personel> persons = new ArrayList<Personel>();
		try {
			java.io.FileInputStream fi = new java.io.FileInputStream(
					"personel.txt");
			java.util.Scanner sc = new java.util.Scanner(fi);
			while (sc.hasNextLine()) {
				String satir = sc.nextLine();
				StringTokenizer st = new StringTokenizer(satir,",");
				int id = Integer.parseInt(st.nextToken());
				String ad = st.nextToken();
				String soyad = st.nextToken();
				int maas = Integer.parseInt(st.nextToken());
				Personel per = new Personel(id, ad, soyad, maas);
				persons.add(per);
			}
		} catch (java.io.FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return persons;
	}

}