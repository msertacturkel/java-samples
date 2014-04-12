package treeset;
import java.io.Serializable;

public class Otomobil implements Serializable, Comparable<Otomobil> {

	// property(OOP) sinif degiskeni (Java) veri elemani(C++)
	private String renk, marka, model;
	private int agirlik, motorHacmi, uretimYili;

	// Otomobil oto=new Otomobil("audi","A1","kirmizi",1000,1400,2011);

	public Otomobil(String mrk, String mdl, String rnk, int agrl, int motHacmi,
			int uretYil) {
		// Yerel degisken sinif degiskenine ataniyor
		marka = mrk;
		model = mdl;
		renk = rnk;
		agirlik = agrl;
		motorHacmi = motHacmi;
		uretimYili = uretYil;

	}

	// method(OOP) metod(java) uye fonksiyon(C++)
	public void klimaCalistir(boolean durum) {
		if (durum)
			System.out.println("isiniyor");
		else
			System.out.println("soguyor");
	}

	public void info() {
		System.out.println("marka:" + marka);
		System.out.println("model:" + model);
		System.out.println("renk:" + renk);
		System.out.println("agirlik:" + agirlik);
		System.out.println("motor hacmi:" + motorHacmi);
		System.out.println("uretim yili:" + uretimYili);
	}

	public String toString() {
		String s = "Otomobil(marka=" + marka + ", model=" + model + ", "
				+ "renk=" + renk + ", agirlik=" + agirlik + ",motor hacmi="
				+ motorHacmi + ", uretim yili=" + uretimYili + ")";

		return s;
	}


	public int compareTo(Otomobil oto) {
		// TODO Auto-generated method stub
		return this.uretimYili-oto.uretimYili;
	}

	
}