package sampleSozluk;

import java.util.StringTokenizer;
import java.util.TreeMap;

public class Sozluk {

	public Sozluk() {
        try {
			java.io.FileInputStream fi = new java.io.FileInputStream(
					"~/ingTurk.txt");
			java.util.Scanner sc = new java.util.Scanner(fi);
			TreeMap<String, String> sozluk=new TreeMap<String, String>();
			while (sc.hasNextLine()) {
				String satir = sc.nextLine();
				StringTokenizer st=new StringTokenizer(satir,",");
				String ing=st.nextToken();
				String turk=st.nextToken();
				//System.out.println(ing+"-->"+turk);
				sozluk.put(ing, turk);
			}//while
			//Dosya okundu ve Map olustu
			//System.out.println(sozluk.get("hello"));
			System.out.print("Kelime girin:");
			java.util.Scanner sc1 = new java.util.Scanner(System.in);
			String kelime=sc1.nextLine();
			System.out.println(sozluk.get(kelime));
		} catch (java.io.FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Sozluk();

	}

}